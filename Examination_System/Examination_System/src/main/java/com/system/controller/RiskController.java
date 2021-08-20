package com.system.controller;

import com.system.po.Risk;
import com.system.service.RiskService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class RiskController {
    @Autowired
    private RiskService riskService;

    @RequestMapping("/admin")
    public String list(Model model, Integer page) throws Exception {
        List<Risk> list = riskService.queryAllRisk();

        model.addAttribute("riskList", list);
        for (Risk r : list
        ) {
            System.out.println(r.toString());
        }
        return "admin/showKnows";
    }

    @RequestMapping("/wxShowRisk")
    @ResponseBody
    public JSONObject wxList() throws Exception {
        List<Risk> list = riskService.queryAllRisk();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("code",200);
        jsonObject.put("msg","成功");
        jsonObject.put("data",list);
        return jsonObject;
    }
    @RequestMapping("admin/toAddRisk")
    public String toAddRisk() {
        return "admin/addRisk";
    }

    @RequestMapping(value = "admin/addRisk", method = RequestMethod.POST)
    public String addRisk(Risk risk) {
        int flag = riskService.addRisk(risk);
        if (flag != 1) {
            System.out.println("Insert " + risk.toString() + " to table knows failed!");   //需要自己处理
        }
        return "redirect: /admin/showKnows";
    }


    @RequestMapping("admin/toUpdateRisk")
    public ModelAndView toUpdateRisk(int id, ModelAndView mv)
    {
        System.out.println("toUpdateRisk");
        mv.addObject("risk",riskService.queryRiskById(id));
        mv.setViewName("admin/editRisk");
        return mv;
    }

    @RequestMapping(value = "admin/editRisk", method = RequestMethod.POST)
    public String editRisk(Risk risk) {
        int flag = riskService.updateRisk(risk);
        if (flag != 1) {
            System.out.println("update " + risk.toString() + " to table knows failed!");   //需要自己处理
        }
        return "redirect: /admin/showKnows";
    }

    @RequestMapping("admin/toRemoveRisk")
    public ModelAndView toRemoveRisk(int id, ModelAndView mv)
    {
        riskService.delRiskByid(id);
        mv.setViewName("redirect: /admin/showKnows");
        return mv;
    }

}
