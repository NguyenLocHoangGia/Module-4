package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/chuyendoi")
@Controller
public class ChuyenDoiController {
    @GetMapping
    public ModelAndView modelAndView (){
        ModelAndView modelAndView = new ModelAndView("chuyendoi");
        return modelAndView;
    }

    @PostMapping
    public ModelAndView chuyenDoi(@RequestParam("USD") double USD){
        ModelAndView modelAndView = new ModelAndView("chuyendoi");
        double VND = USD*23000;
        modelAndView.addObject("VND",VND);
        return modelAndView;
    }
}
