package com.system.service.impl;

import com.system.mapper.HotsMapper;
import com.system.po.Hots;
import com.system.service.HotsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotsServiceImpl implements HotsService {

    @Autowired
    private HotsMapper hotsMapper;

    private void setHotsMapper(HotsMapper hotsMapper ){
        this.hotsMapper=hotsMapper;
    }


    public int addHots(Hots hots) {
        return hotsMapper.addHots(hots);
    }

    public int delHotsById(int id) {
        return hotsMapper.delHotsById(id);
    }

    public int updateHots(Hots hots) {
        return hotsMapper.updateHots(hots);
    }

    public List<Hots> queryAllHots() {
        return hotsMapper.queryAllHots();
    }

    public Hots queryHotsById(int id) {
        return hotsMapper.queryHotsById(id);
    }
}
