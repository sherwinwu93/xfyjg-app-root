package com.xfjyg.appcommon.exception.runtimeexception;

import com.xfjyg.appcommon.exception.ExceptionDef;
import org.apache.commons.lang3.StringUtils;

public class ExceptionFactory {
    private static final long serialVersionUID = 1L;

    public static AppRuntimeException create(ExceptionDef codeDef, String message) {
        if (StringUtils.isEmpty(message)) return create(codeDef);
        return new AppRuntimeException(codeDef.httpStatus(), codeDef.code(), message);
    }

    public static AppRuntimeException create(ExceptionDef codesDef) {
        return new AppRuntimeException(codesDef.httpStatus(), codesDef.code(), codesDef.defaultMessage());
    }
}
