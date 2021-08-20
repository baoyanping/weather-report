package com.system.service.impl;

import com.system.mapper.RiskMapper;
import com.system.po.Risk;
import com.system.service.RiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskServiceImpl implements RiskService {

    @Autowired
    private RiskMapper riskMapper;

    public void setRiskMapper(RiskMapper riskMapper) {
        this.riskMapper = riskMapper;
    }

    public int addRisk(Risk risk) {
        return riskMapper.addRisk(risk);
    }

    public int delRiskByid(int id) {
        return riskMapper.delRiskByid(id);
    }

    public Risk queryRiskById(int id) {
        return riskMapper.queryRiskById(id);
    }

    public int updateRisk(Risk risk) {
        return riskMapper.updateRisk(risk);
    }

    public List<Risk> queryAllRisk() {
        return riskMapper.queryAllRisk();
    }
}
