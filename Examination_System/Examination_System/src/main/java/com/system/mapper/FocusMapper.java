package com.system.mapper;

import com.system.po.Focus;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FocusMapper {

    int addFocus(Focus focus);

    int delFocusById(int id);

    //Knows queryBookById(@Param("id") int id);

    int updateFocus(Focus focus);

    List<Focus> queryAllFocus();

    Focus queryFocusById(int id);

    Focus queryFocusByloadfrom(Focus focus);
}
