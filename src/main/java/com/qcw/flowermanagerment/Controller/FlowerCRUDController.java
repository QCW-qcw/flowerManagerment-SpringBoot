package com.qcw.flowermanagerment.Controller;

import com.qcw.flowermanagerment.Config.Result;
import com.qcw.flowermanagerment.Model.Flower;
import com.qcw.flowermanagerment.Service.FlowerCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/crud")
public class FlowerCRUDController {
    @Autowired
    private FlowerCRUDService flowerCRUDService;

    //查
    @RequestMapping("allflowers")
    public Result getAllFlowerInfo(){
        List<Flower> allFlowers = flowerCRUDService.getAllFlowers();
        return Result.success("所有花卉信息",allFlowers);
    }







}
