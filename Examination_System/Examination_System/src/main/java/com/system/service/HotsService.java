package com.system.service;

import com.system.po.Hots;

import java.util.List;


public interface HotsService {

    int addHots(Hots hots);

    int delHotsById(int id);

    //Knows queryBookById(@Param("id") int id);

    int updateHots(Hots hots);

    List<Hots> queryAllHots();

    Hots queryHotsById(int id);

}
