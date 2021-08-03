package com.qcw.flowermanagerment.Mapper;

import com.qcw.flowermanagerment.Model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper

public interface UserMapper {
    int deleteById(String userid);

    int insert(User record);

    User selectByPrimaryKey(String userid);

    List<User> selectAll();

    int updateUser(User record);

    int checkUser(String username);

    int checkUserPassword(String username, String password);

    String getMasterinfo(String userid);

    int updateMasterinfo(String userid, String s);
}