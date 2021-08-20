package com.system.mapper;

import com.system.po.Knows;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface KnowMapper {

    public int addKnow(Knows know);

    int delKnowById(int id);

    Knows queryBookById(@Param("id") int id);

    int updateKnows(Knows knows);

     List<Knows> queryAllKnow();
}
