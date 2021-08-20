package com.system.service;

import com.system.po.Load;

import java.util.List;

public interface LoadService {
    public int addLoad(Load load);

    int delLoadById(int id);

    Load queryLoadById(int id);

    int updateLoad(Load load);

    List<Load> queryAllLoad();
}
