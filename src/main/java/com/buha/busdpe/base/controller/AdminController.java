package com.buha.busdpe.base.controller;

import com.buha.busdpe.base.entity.SysMenu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mv){
        List<SysMenu> menus = new ArrayList<>();
        for (int i=0;i<7;i++){
            SysMenu sm = new SysMenu();
            sm.setId("m"+i);
            sm.setName("Menu"+i);
            //sm.setUrl("childrenMenu");
            menus.add(sm);
        }
        mv.addObject("menus",menus);
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "/dashboard",method = RequestMethod.GET)
    public ModelAndView dashboard(ModelAndView mv){
        return mv;
    }
}
