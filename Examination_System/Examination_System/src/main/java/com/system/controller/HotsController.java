package com.system.controller;


import com.system.po.Hots;
import com.system.service.HotsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class HotsController {

    @Autowired
    private HotsService hotsService;

    @RequestMapping("/showFocus1")
    public String queryHotList(Model model, Integer page) throws Exception {
        List<Hots> list = hotsService.queryAllHots();
        model.addAttribute("hotsList", list);
        for (Hots h : list
        ) {
            System.out.println(h.toString());
        }
        return "admin/showFocus";
    }

    @RequestMapping("/toAddHots")
    public String toAddHots() {
        return "admin/addHots";
    }

    @RequestMapping(value = "addHots", method = RequestMethod.POST)
    public String addHots(Hots hots) {
        int flag = hotsService.addHots(hots);
        if (flag != 1) {
            System.out.println("Insert " + hots.toString() + " to table knows failed!");   //需要自己处理
        }
        return "redirect: /admin/showFocus";
    }


    @RequestMapping("/toUpdateHots")
    public String toUpdateHots(int id ,Model model) {
        model.addAttribute("hots",hotsService.queryHotsById(id));
        return "admin/editHots";
    }

    @RequestMapping(value = "editHots", method = RequestMethod.POST)
    public String editHots(Hots hots) {
        int flag = hotsService.updateHots(hots);
        if (flag != 1) {
            System.out.println("update " + hots.toString() + " to table knows failed!");   //需要自己处理
        }
        return "redirect: showFocus";
    }

    @RequestMapping(value = "/toRemoveHots", method = {RequestMethod.GET})
    private String toRemoveHots(@RequestParam("id") Integer id) throws Exception {
        System.out.println("id："+id);
        if (id == null) {
            //加入没有带学生id就进来的话就返回学生显示页面
            return "redirect:/admin/showFocus";
        }
        hotsService.delHotsById(id);//.
        return "redirect:/admin/showFocus";
    }


}




