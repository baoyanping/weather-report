package com.system.service.impl;

import com.system.mapper.KnowMapper;
import com.system.po.Knows;
import com.system.service.KnowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KnowServiceImpl implements KnowService {
    @Autowired
    private KnowMapper knowMapper;

    public void setKnowMapper(KnowMapper knowMapper) {
        this.knowMapper=knowMapper;
    }
    public int addKnow(Knows know) {
        return knowMapper.addKnow(know);
    }

    public int delKnowById(int id) {
        return knowMapper.delKnowById(id);
    }

    public int updateKnows(Knows knows) {
        return knowMapper.updateKnows(knows);
    }

    public Knows queryBookById(int id) {
        return knowMapper.queryBookById(id);
    }


    public List<Knows> queryAllKnow() {
        return knowMapper.queryAllKnow();
    }
}
