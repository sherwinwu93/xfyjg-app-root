package com.xfjyg.managementservice.utils;

import org.apache.commons.lang3.StringUtils;

public class SqlUtils {
    public static String like(String x) {
        if (StringUtils.isEmpty(x)) return x;
        return "%" + x + "%";
    }

    public static String rightLike(String x) {
        if (StringUtils.isEmpty(x)) return x;
        return "%" + x;
    }

    public static String leftLike(String x) {
        if (StringUtils.isEmpty(x)) return x;
        return x + "%";
    }

}
