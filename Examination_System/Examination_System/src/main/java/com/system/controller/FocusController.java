package com.system.controller;

import com.system.po.Focus;
import com.system.po.Hots;
import com.system.service.FocusService;
import com.system.service.HotsService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class FocusController {
    @Autowired
    private FocusService focusService;
    @Autowired
    private HotsService hotsService;

    @RequestMapping("/showFocus")
    public String list(Model model, Integer page) throws Exception {
        List<Focus> list = focusService.queryAllFocus();
        List<Hots> hotsList= hotsService.queryAllHots();
        model.addAttribute("focusList", list);
        model.addAttribute("hotsList", hotsList);
        for (Focus f : list
        ) {
            System.out.println(f.toString());
        }
        return "admin/showFocus";
    }

    @RequestMapping("/wxShowFocus")
    @ResponseBody
    public JSONObject wxList() throws Exception {
        List<Focus> list = focusService.queryAllFocus();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("code",200);
        jsonObject.put("msg","成功");
        jsonObject.put("data",list);
        return jsonObject;
    }



    @RequestMapping("/toAddFocus")
    public String toAddFocus() {
        return "admin/addFocus";
    }
    @RequestMapping(value = "addFocus", method = RequestMethod.POST)
    public String addFocus(Focus focus) {
        int flag = focusService.addFocus(focus);
        if (flag != 1) {
            System.out.println("Insert " + focus.toString() + " to table knows failed!");   //需要自己处理
        }
        return "redirect: showFocus";
    }


    @RequestMapping("/toUpdateFocus")
    public String toUpdateFocus(int id ,Model model) {
        model.addAttribute("focus",focusService.queryFocusById(id));
        return "admin/editFocus";
    }

    @RequestMapping(value = "editFocus", method = RequestMethod.POST)
    public String editFocus(Focus focus) {
        int flag = focusService.updateFocus(focus);
        if (flag != 1) {
            System.out.println("update " + focus.toString() + " to table knows failed!");   //需要自己处理
        }
        return "redirect: showFocus";
    }

    @RequestMapping(value = "/toRemoveFocus", method = {RequestMethod.GET})
    private String toRemoveFocus(Integer id) throws Exception {
        if (id == null) {
            //加入没有带学生id就进来的话就返回学生显示页面
            return "/admin/showFocus";
        }
        focusService.delFocusById(id);
        return "redirect:/admin/showFocus";
    }


}




