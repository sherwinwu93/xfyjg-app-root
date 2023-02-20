package com.xfjyg.appcommon.config.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

@Configuration
public class KeyStringRedisSerializer implements RedisSerializer<String> {
    @Value("${redisPrefix}")
    private String redisPrefix;

    @Override
    public byte[] serialize(String string) throws SerializationException {
        return (string == null ? null : (redisPrefix +":"+ string).getBytes());
    }

    @Override
    public String deserialize(byte[] bytes) throws SerializationException {
        return (bytes == null ? null : new String(bytes).replaceFirst(redisPrefix + ":", ""));
    }
}
