package com.qcw.flowermanagerment.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;

import java.io.Serializable;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class RedisUtil {
    @Autowired
    private static RedisTemplate redisTemplate;


    /*字符串写入 */
    public static boolean set(final String key, Object value) {
        try {
            redisTemplate.opsForValue().set(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            return false;
        }
    }

    /*设置过期时间*/
    public static boolean set(final String key, Object value, Long expireTime, TimeUnit timeUnit) {
        try {
            redisTemplate.opsForValue().set(key, value, expireTime, timeUnit);
/*            redisTemplate.opsForValue().set(key,value);
            redisTemplate.expire(key,expireTime,timeUnit);
*/
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /*删除key*/
    public static boolean remove(final String key) {
        if (redisTemplate.hasKey(key)) {
            redisTemplate.delete(key);
            return true;
        }
        return false;
    }

    /*删除符合样式的keys*/
    public static boolean removePattern(final String keyPattern) {
        Set<Serializable> keys = redisTemplate.keys(keyPattern);
        if (keys.size() > 0) {
            redisTemplate.delete(Collections.singleton(keys));
            return true;
        }
        return false;
    }

    /*是否存在key*/
    public static boolean exists(final String key) {
        return redisTemplate.hasKey(key);
    }

    /*get                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 */
    public static Object get(String key) {
        return  redisTemplate.opsForValue().get(key);
    }
}
