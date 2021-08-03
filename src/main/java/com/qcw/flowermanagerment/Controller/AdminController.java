package com.qcw.flowermanagerment.Controller;


import com.qcw.flowermanagerment.Config.Result;
import com.qcw.flowermanagerment.Model.User;
import com.qcw.flowermanagerment.Service.FlowerCRUDService;
import com.qcw.flowermanagerment.Service.UserService;
import com.qcw.flowermanagerment.Utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserService userService;
    @Autowired
    private FlowerCRUDService flowerCRUDService;

    //获取用户所有信息
    @GetMapping("/allusers")
    public Result getAllUsers(){
        List<User> users =userService.getAllUsers();
        return Result.success("请求所有用户信息成功",users);
    }


    //注册用户  --仅有管理员权限可以注册
    @PostMapping("/register")
    public Result register(String userid, String password1, String password2) {

        return userService.registerUser(userid, password1, password2);
    }

    //删除用户
    @PostMapping("/delUser")
    public Result delUser(String userid) {

    return userService.deleteUser(userid);
    }

    //更改为管理员
    @PostMapping("/changeType")
    public Result changeUserType(String userid){
        return userService.changeUserType(userid);
    }



    // 删除花卉记录
    @PostMapping("delFlower")
    public Result flowerDel(String id){

        return flowerCRUDService.flowerDel(id);
    }


}
