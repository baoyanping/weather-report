package com.system.service;

import com.system.po.Knows;

import java.util.List;

public interface KnowService {

    public int addKnow(Knows know);

    int delKnowById(int id);

    int updateKnows(Knows knows);

    Knows queryBookById(int id);

    List<Knows> queryAllKnow();


}
