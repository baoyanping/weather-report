package com.system.mapper;

import com.system.po.Risk;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RiskMapper {
    public int addRisk(Risk risk);

    int delRiskByid(int id);

    Risk queryRiskById(@Param("id") int id);

    int updateRisk(Risk risk);

    List<Risk> queryAllRisk();
}

