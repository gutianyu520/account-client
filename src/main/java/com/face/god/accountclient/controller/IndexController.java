package com.face.god.accountclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Create by KT104968 on 2020/12/01
 */
@Controller
@RequestMapping(value = "/index")
public class IndexController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        ModelAndView view = new ModelAndView();
        view.setViewName("index.html");
        return view;
    }

}
