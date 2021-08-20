package com.system.service.impl;

import com.system.mapper.LoadMapper;
import com.system.po.Load;
import com.system.service.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadServiceImpl implements LoadService {
    @Autowired
    public LoadMapper loadMapper;

    public void setLoadMapper(LoadMapper loadMapper) {
        this.loadMapper=loadMapper;
    }

    public int addLoad(Load load) {
        return loadMapper.addLoad(load);
    }

    public int delLoadById(int id) {
        return loadMapper.delLoadById(id);
    }

    public Load queryLoadById(int id) {
        return loadMapper.queryLoadById(id);
    }

    public int updateLoad(Load load) {
        return loadMapper.updateLoad(load);
    }

    public List<Load> queryAllLoad() {
        return loadMapper.queryAllLoad();
    }
}
