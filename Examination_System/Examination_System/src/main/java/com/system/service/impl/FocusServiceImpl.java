package com.system.service.impl;

import com.system.mapper.FocusMapper;
import com.system.po.Focus;
import com.system.service.FocusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FocusServiceImpl implements FocusService {

    @Autowired
    private FocusMapper focusMapper;

    private void setFocusMapper(FocusMapper focusMapper){
        this.focusMapper=focusMapper;
    }
    public int addFocus(Focus focus) {
        return focusMapper.addFocus(focus);
    }

    public int delFocusById(int id) {
        return focusMapper.delFocusById(id);
    }

    public int updateFocus(Focus focus) {
        return focusMapper.updateFocus(focus);
    }

    public Focus queryFocusByloadfrom(Focus focus) {
        return focusMapper.queryFocusByloadfrom(focus);
    }

    public Focus queryFocusById(int id){
        return focusMapper.queryFocusById(id);
    }
    public List<Focus> queryAllFocus() {
        return focusMapper.queryAllFocus();
    }

}
