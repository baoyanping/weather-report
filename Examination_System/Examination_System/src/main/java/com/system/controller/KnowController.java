package com.system.controller;

import com.system.po.Knows;
import com.system.po.Risk;
import com.system.service.KnowService;
import com.system.service.RiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class KnowController {
    @Autowired
    private KnowService knowService;
    @Autowired
    private RiskService riskService;

    @RequestMapping("/showKnows")
    public String list(Model model, Integer page) throws Exception {
        List<Knows> list = knowService.queryAllKnow();
        List<Risk> list1= riskService.queryAllRisk();
        model.addAttribute("knowList", list);
        model.addAttribute("riskList", list1);
        for (Risk k : list1
        ) {
            System.out.println(k.toString());
        }
        return "admin/showKnows";
    }

    @RequestMapping("/showKnowsList")
    @ResponseBody
    public Map<String,Object> showKnowsList(Model model, Integer page) throws Exception {
        Map<String,Object> map = new HashMap<String, Object>();
        List<Knows> list = knowService.queryAllKnow();
        map.put("data",list);
        return map;
    }


    @RequestMapping("/toAddKnows")
    public String toAddKnows() {
        return "admin/addKnows";
    }

    @RequestMapping(value = "addKnows", method = RequestMethod.POST)
    public String addKnows(Knows knows) {
        int flag = knowService.addKnow(knows);
        if (flag != 1) {
            System.out.println("Insert " + knows.toString() + " to table knows failed!");   //需要自己处理
        }
        return "redirect:/admin/showKnows";
    }


    @RequestMapping("/toUpdateKnows")
    public String toUpdateKnows(int id,Model model)
    {
        model.addAttribute("knows",knowService.queryBookById(id));
        return "admin/editKnows";
    }

    @RequestMapping(value = "editKnows", method = RequestMethod.POST)
    public String editKnows(Knows knows) {
        int flag = knowService.updateKnows(knows);
        if (flag != 1) {
            System.out.println("update " + knows.toString() + " to table knows failed!");   //需要自己处理
        }
        return "redirect: showKnows";
    }

    @RequestMapping(value = "/toRemoveKnows", method = {RequestMethod.GET})
    private String toRemoveKnows(Integer id) throws Exception {
        if (id == null) {
            //加入没有带学生id就进来的话就返回学生显示页面
            return "redirect:/admin/showKnows";
        }
        knowService.delKnowById(id);
        return "redirect:/admin/showKnows";
    }


}




