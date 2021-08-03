package com.qcw.flowermanagerment.Service;

import com.qcw.flowermanagerment.Config.Result;
import com.qcw.flowermanagerment.Mapper.UserMapper;
import com.qcw.flowermanagerment.Model.User;
import com.qcw.flowermanagerment.Utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public boolean checkUser(String username) {
        if (userMapper.checkUser(username) != 0) {
            return true;
        } else {
            return false;
        }
    }


    public boolean checkUserPassword(String username, String password) {
        if (userMapper.checkUserPassword(username, password) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void addUser(String userid, String password1) {
        userMapper.insert(new User(userid, password1, "0"));
    }

    public Result deleteUser(String userid) {

        if (!checkUser(userid)) {
            return Result.fail(userid + " 该用户不存在");
        }
        try {
            userMapper.deleteById(userid);
            return Result.success(userid + " 用户已被删除");
        } catch (Exception e) {
            return Result.fail(e.getMessage());
        }

    }

    public void updateUser(String userId, String newPassword1) {
        userMapper.updateUser(new User(userId, newPassword1, "0"));
    }

    public List<User> getAllUsers() {
        List<User> users = userMapper.selectAll();
        return users;
    }

    public Result registerUser(String userid, String password1, String password2) {
        if ("".equals(userid) || "".equals(password1) || "".equals(password2)) {
            return Result.fail("请输入完整的注册信息");
        }

        if (!StringUtil.checkUserId(userid)) {
            return Result.fail(" userId格式错误，必须8位数字");
        }
        if (checkUser(userid)) {
            return Result.fail("用户帐号已存在");
        } else {
            if (!password1.equals(password2)) {
                return Result.fail("两次输入的密码不一致");
            } else if (!StringUtil.checkPassword(password1)) {
                return Result.fail("密码格式错误，密码长度为8到20位,必须包含字母和数字，字母区分大小写");
            } else {
                try {
                    addUser(userid, password1);
                    return Result.success("注册成功");
                } catch (Exception e) {
                    return Result.fail(e.getMessage());
                }
            }
        }

    }

    //改变用户类型 用户变为管理员 管理员变为用户 同级不做修改
    public Result changeUserType(String userid) {
        try {
            String masterinfo = userMapper.getMasterinfo(userid);
            if ("0".equals(masterinfo)) {
                userMapper.updateMasterinfo(userid, "1");
            } else {
                userMapper.updateMasterinfo(userid, "0");
            }
            return Result.success(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Result.fail("操作失败");
    }
}
