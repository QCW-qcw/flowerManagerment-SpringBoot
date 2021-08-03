package com.qcw.flowermanagerment.Controller;

import com.qcw.flowermanagerment.Config.Result;
import com.qcw.flowermanagerment.Utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.qcw.flowermanagerment.Service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
class UserController {
    @Autowired
    private UserService userService;

    //登录
/*    @RequestMapping("login/{username}/{password}")
    public Result login(@PathVariable("username") String username, @PathVariable("password") String password) {*/
        @RequestMapping("login")
    public Result login( String username,  String password) {
        if (!userService.checkUser(username)) {
            return Result.fail("不存在的用户名");
        }
        if (!userService.checkUserPassword(username, password)) {
            return Result.fail("用户密码错误");
        } else {

            return Result.success("登录成功");
        }
    }

    //退出
    @RequestMapping("logout")
    public Result logout() {

        return Result.success("已登出");

    }

    //修改用户密码  用户id不能改变
    @RequestMapping("changepassword")
    public Result changePassword(String userId,String oldPassword, String newPassword1,String newPassword2) {
        if(!userService.checkUserPassword(userId,oldPassword)){
            return Result.fail("输入的用户密码不正确");
        }else{

            if(newPassword1.equals(newPassword2)){

                if(StringUtil.checkPassword(newPassword1)){
                    try {
                        userService.updateUser(userId,newPassword1);
                        return Result.success(userId + " 密码修改成功");
                    }catch(Exception e){
                        return Result.fail(e.getMessage());
                    }
                }else {
                    return Result.fail("密码格式错误，密码长度为8到20位,必须包含字母和数字，字母区分大小写");
                }

            }else {
                return Result.fail("两次输入的密码不一致");
            }
        }

    }


}