package com.system.controller;

import com.system.po.Load;
import com.system.service.LoadService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoadController {

    @Autowired
    private LoadService loadService;
    /**
     * @param
     * @return 添加商品
     * @throws
     * @throws IllegalStateException
     */
    @RequestMapping(value = "/addload",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> addLoad(@RequestBody Load l, HttpServletResponse resp) throws IllegalStateException, IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        l.setLoad_publishdate(sdf1.format(new Date()));
        l.setLoad_publishtime(sdf2.format(new Date()));
        loadService.addLoad(l);
        map.put("res",0);
        return map;
    }

    @RequestMapping(value = "admin/addLoad",method = RequestMethod.GET)
    public ModelAndView toadd(ModelAndView mv){
        mv.setViewName("admin/addLoad");
        return mv;
    }

    @RequestMapping(value = "admin/addLoad",method = RequestMethod.POST)
    public ModelAndView addLoad(Load l, ModelAndView mv) throws IllegalStateException, IOException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        l.setLoad_publishdate(sdf1.format(new Date()));
        l.setLoad_publishtime(sdf2.format(new Date()));
        loadService.addLoad(l);
        mv.setViewName("redirect:/admin/showLoad");
        return mv;
    }

    @GetMapping("getLoadList")
    @ResponseBody
    public JSONObject getLoadList(){
        List<Load> list = loadService.queryAllLoad();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("code",200);
        jsonObject.put("msg","成功");
        jsonObject.put("data",list);
        return jsonObject;
    }

    @RequestMapping("admin/showLoad")
    public ModelAndView queryAllLoads(ModelAndView mv){
        List<Load> loads = loadService.queryAllLoad();
        mv.addObject("loadList",loads);
        mv.setViewName("admin/showLoad");
        return mv;
    }

    @RequestMapping("admin/toRemoveLoad")
    public ModelAndView toRemoveLoad(int id,ModelAndView mv){
        loadService.delLoadById(id);
        mv.setViewName("redirect:/admin/showLoad");
        return mv;
    }

    @RequestMapping(value = "admin/toUpdateLoad",method = RequestMethod.GET)
    public ModelAndView toUpdateLoad(int id,ModelAndView mv){
        Load load = loadService.queryLoadById(id);
        mv.addObject("load",load);
        mv.setViewName("admin/editload");//?没有页面？ 修改页面 , 加一个修改页面 editloadok就可以了吗 对的，路径写对
        return mv;
    }

    @RequestMapping(value = "admin/updateLoad",method = RequestMethod.POST)
    public ModelAndView updateLoad(Load load,ModelAndView mv){
        loadService.updateLoad(load);
        mv.setViewName("redirect:/admin/showLoad");
        return mv;
    }

//    @RequestMapping("admin/showLoad")
//    public ModelAndView queryAllLoads(ModelAndView mv){
//        List<Load> loads = loadService.queryAllLoad();
//        mv.addObject("loadList",loads);
//        mv.setViewName("admin/showLoad");
//        return mv;
//    }
}
