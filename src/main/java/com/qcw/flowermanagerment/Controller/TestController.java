package com.qcw.flowermanagerment.Controller;

import com.qcw.flowermanagerment.Config.Result;
import com.qcw.flowermanagerment.Model.Flower;
import com.qcw.flowermanagerment.Model.User;
import com.qcw.flowermanagerment.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

   @Autowired
    private TestService testService;

    @RequestMapping("/allFlowers")
    public   Result getAllFlowers(){
        List<Flower> allFlower = testService.getAllFlower();
        return Result.success(allFlower);

    }

    @RequestMapping("/allUsers")
    public  Result allUsers(){
        return Result.success(testService.getAllUser());
    }

    @PostMapping("/testadduser")
    public Result testAddUser(String id,String password,String master){
        User user = new User(id,password,master);
        return testService.testUser(user);
    }

}
