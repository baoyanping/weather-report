package com.system.mapper;

import com.system.po.Hots;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HotsMapper {

    int addHots(Hots hots);

    int delHotsById(int id);

    //Knows queryBookById(@Param("id") int id);

    int updateHots(Hots hots);

    List<Hots> queryAllHots();

    Hots queryHotsById(int id);
}
