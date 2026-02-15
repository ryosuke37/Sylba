package io.github.ryosuke37.sylva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SylvaController {

    @GetMapping
    public ModelAndView top(){
        ModelAndView mav = new ModelAndView("/top");
        mav.addObject("message", "Welcome to Sylva!");
        return mav;
    }
}
