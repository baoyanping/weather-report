package com.system.service;

import com.system.po.Risk;

import java.util.List;

public interface RiskService {

    public int addRisk(Risk risk);

    int delRiskByid(int id);

    Risk queryRiskById(int id);

    int updateRisk(Risk risk);

    List<Risk> queryAllRisk();
}
