package me.course.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    @GetMapping("/load")
    public ModelAndView test1() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");
        return mv;
    }
@RequestMapping("/home")
@ResponseBody
public String home(){
    return "Hello World!";
}
}
