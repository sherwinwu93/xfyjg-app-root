package com.xfjyg.appcommon.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BeanUtilz {
    public static void copyProperties(Object source, Object target) {
        if (source != null) {
            if (source instanceof Map) {
                BeanWrapper beanWrapper = new BeanWrapperImpl(target);
                beanWrapper.setPropertyValues((Map<?, ?>) source);
            } else {
                BeanUtils.copyProperties(source, target);
            }
        }
    }

    public static <T> T copyProperties(Object source, Class<T> clazz) {
        if (source != null) {
            T target = BeanUtils.instantiateClass(clazz);
            copyProperties(source, target);
            return target;
        }
        return null;
    }

    public static <S, T> List<T> copyPropertiesByList(List<S> sourceList, Class<T> type) {
        if (sourceList != null && sourceList.size() > 0) {
            List<T>  targetList = new ArrayList<>();
            for (S s : sourceList) {
                T t = copyProperties(s, type);
                targetList.add(t);
            }
            return targetList;
        }
        return new ArrayList<>();
    }
}
