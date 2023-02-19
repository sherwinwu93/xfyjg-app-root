package com.xfjyg.sapiservice.security;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {


    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain)
            throws ServletException, IOException {
        // 获取表头
        String authHeader = httpServletRequest.getHeader(this.tokenHeader);

        if (StringUtils.isNotBlank(authHeader) && authHeader.startsWith(this.tokenHead)) {
            // 获取token
            String authToken = authHeader.substring(this.tokenHead.length());
            // 解析token获得username
            String username = jwtTokenUtil.getUserNameFromToken(authToken);
            log.info("checking authentication " + username);

            // username存在,且未认证和授权
            if (StringUtils.isNotBlank(username) && SecurityContextHolder.getContext().getAuthentication() == null) {
                UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
                if (jwtTokenUtil.validateToken(authToken, userDetails)) {// 校验token的有效期
                    // 认证和授权
                    UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
                            userDetails, null, userDetails.getAuthorities());
                    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(
                            httpServletRequest));
                    log.info("authenticated user " + username + ", setting security context");
                    SecurityContextHolder.getContext().setAuthentication(authentication);

                    if (jwtTokenUtil.needRefresh(authToken)) {
                        String freshToken = jwtTokenUtil.generateToken(userDetails);
                        httpServletResponse.addHeader("Authorization", freshToken);
                    }
                }
            }
        }
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}