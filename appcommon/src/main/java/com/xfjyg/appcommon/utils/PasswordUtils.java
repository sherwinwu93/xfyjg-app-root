package com.xfjyg.appcommon.utils;

import com.xfjyg.appcommon.exception.ExceptionDef;
import com.xfjyg.appcommon.exception.runtimeexception.ExceptionFactory;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordUtils {
    private static PasswordEncoder encoder;

    @Autowired
    public PasswordUtils(PasswordEncoder encoder) {
        this.encoder = encoder;
    }

    private final static String USER_PASSWORD_REGIX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";
    public static boolean isUnqualifiedPassword(String password) {
        if (StringUtils.isEmpty(password)) return false;
        return password.matches(USER_PASSWORD_REGIX);
    }

    public static void validateQualifiedPassword(String password) {
        if (isUnqualifiedPassword(password)) {
            throw ExceptionFactory.create(ExceptionDef.CODE_ILLEGAL_CONTENT,
                    "至少8个字符，至少1个大写字母，1个小写字母和1个数字");
        }
    }
}
