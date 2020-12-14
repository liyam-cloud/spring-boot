package com.example.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

@Controller
public class JspController {

    @Value("${demo.welcome:welcome to config default}")
    private String welcome = "welcome to static default !";

    @RequestMapping("/welcome")
    public String welcome(Map<String, Object> model){
        model.put("time", new Date());
        model.put("message", welcome);
        return "index";
    }

    @RequestMapping("/page1")
    public ModelAndView page1(){
        ModelAndView mav = new ModelAndView("page");
        mav.addObject("content", "Hello page1!");
        return mav;
    }

    @RequestMapping("/page2")
    public String page2(Model model){
        model.addAttribute("content", "Hello page2!");
        return "page";
    }
}
