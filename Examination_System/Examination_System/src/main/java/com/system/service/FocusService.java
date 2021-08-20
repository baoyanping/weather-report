package com.system.service;

import com.system.po.Focus;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface FocusService {

    int addFocus(Focus focus);

    int delFocusById(int id);

    //Knows queryBookById(@Param("id") int id);
    Focus queryFocusById(int id);
    int updateFocus(Focus focus);
    Focus queryFocusByloadfrom(@Param("focus") Focus focus);
    List<Focus> queryAllFocus();

}
