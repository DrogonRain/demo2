package cn.zhangbin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MethodController {

    @RequestMapping(value = "/hello",method = {RequestMethod.POST})
    public String index2(Model model){
        model.addAttribute("msg","hello!");
        return "test";
    }
}
