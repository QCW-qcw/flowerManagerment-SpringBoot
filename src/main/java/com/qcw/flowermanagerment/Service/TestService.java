package com.qcw.flowermanagerment.Service;

import com.qcw.flowermanagerment.Config.Result;
import com.qcw.flowermanagerment.Mapper.FlowerMapper;
import com.qcw.flowermanagerment.Mapper.UserMapper;
import com.qcw.flowermanagerment.Model.Flower;
import com.qcw.flowermanagerment.Model.User;
import com.qcw.flowermanagerment.Utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private FlowerMapper flowerMapper;



//    Logger logger= Logger.getLogger(TestService.class);

    @Autowired
    private UserMapper userMapper;

    public List<Flower> getAllFlower(){
        List<Flower> flowers = flowerMapper.selectAll();
        return flowers;
    }

    public List<User> getAllUser(){
        List<User> users = userMapper.selectAll();
        return users;
    }

    public Result testUser(User user){
        RedisUtil.set(user.getUserid(),user);
        return Result.success(RedisUtil.get(user.getUserid()));
    }

}
