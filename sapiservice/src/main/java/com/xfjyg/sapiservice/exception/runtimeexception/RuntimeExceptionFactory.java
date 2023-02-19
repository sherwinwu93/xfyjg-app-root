package com.xfjyg.sapiservice.exception.runtimeexception;

import com.xfjyg.sapiservice.exception.ExceptionDef;
import org.apache.commons.lang3.StringUtils;

public class RuntimeExceptionFactory {
    private static final long serialVersionUID = 1L;

    public static AppRuntimeException create(ExceptionDef codeDef, String message) {
        if (StringUtils.isEmpty(message)) return create(codeDef);
        return new AppRuntimeException(codeDef.httpStatus(), codeDef.code(), message);
    }

    public static AppRuntimeException create(ExceptionDef codesDef) {
        return new AppRuntimeException(codesDef.httpStatus(), codesDef.code(), codesDef.defaultMessage());
    }
}
