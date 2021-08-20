package com.system.mapper;

import com.system.po.Load;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LoadMapper {
    public int addLoad(Load load);

    int delLoadById(int id);

    Load queryLoadById(@Param("id") int id);

    int updateLoad(Load load);

    List<Load> queryAllLoad();


}
