package com.qcw.flowermanagerment.Mapper;

import com.qcw.flowermanagerment.Model.Flower;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface FlowerMapper {
    int deleteByPrimaryKey(String id);

    int insert(Flower record);

    Flower selectByPrimaryKey(String id);

    List<Flower> selectAll();

    int updateByPrimaryKey(Flower record);
}