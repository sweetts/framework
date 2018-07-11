package com.sugar.springmvc.controller;

import com.sugar.Service.BW001Service;
import com.sugar.beans.BW003Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by TangSu on 2017/5/8.
 */
@Controller
public class HelloController {
    BW001Service bw001Service = null;
    @RequestMapping("/greeting")
    public ModelAndView greeting(@RequestParam(value = "name",defaultValue = "world")String name){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("userName",name);
        return new ModelAndView("/hello",map);
    }

    @RequestMapping("/test")
    public ModelAndView test(@RequestParam(value = "name",defaultValue = "world")String name){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("userName",name);
        return new ModelAndView("/1111",map);
    }

    @RequestMapping("/menu")
    public ModelAndView menu(){
        return new ModelAndView("/menu");
    }

    @RequestMapping("/2222")
    public ModelAndView menu2(){
        return new ModelAndView("/2222").addObject("name","testName");
    }

    @RequestMapping("/3333")
    public ModelAndView menu3(){
        return new ModelAndView("/3333");
    }

    @ResponseBody
    @RequestMapping("/bwList")
    public List<BW003Bean> json(){
        bw001Service = new BW001Service();
        return bw001Service.selectAll();
    }

    @ResponseBody
    @RequestMapping("/deleteBw")
    public Object delete(@RequestParam(value = "bwid001")String bwid001){
        bw001Service = new BW001Service();
        bw001Service.deleteBw001(bwid001);
        Map map = new HashMap();
        map.put("success","success");
        return map;
    }

}
