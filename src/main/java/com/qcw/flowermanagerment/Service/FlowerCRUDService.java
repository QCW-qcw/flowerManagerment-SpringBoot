package com.qcw.flowermanagerment.Service;

import com.qcw.flowermanagerment.Config.Result;
import com.qcw.flowermanagerment.Mapper.FlowerMapper;
import com.qcw.flowermanagerment.Model.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerCRUDService {
    @Autowired
    private FlowerMapper flowerMapper;

    public List<Flower> getAllFlowers() {
        List<Flower> flowers = flowerMapper.selectAll();
        return flowers;

    }

    public Result flowerDel(String id) {
        try {
            flowerMapper.deleteByPrimaryKey(id);
            return Result.success("删除记录成功");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return Result.fail("删除记录失败");
    }
}
