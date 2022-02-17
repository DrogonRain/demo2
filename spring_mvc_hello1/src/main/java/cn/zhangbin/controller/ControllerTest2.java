package cn.zhangbin.controller;

import cn.zhangbin.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerTest2 {
    @RequestMapping("/t2")
    public String index(Model model){
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg","ControllerTest2");
        //返回视图位置
        return "test";
    }

    // @RequestParam("username") : username提交的域名称 域名与方法名不一致
    @RequestMapping("/hello")
    public String hello(@RequestParam("username") String name){
        System.out.println(name);
        return "hello";
    }

    @RequestMapping("/User")
    public String User(User user,Model model){
        model.addAttribute("user",user); // 相当于req.setAttribute("name",name);
        return "hello";
    }

    @RequestMapping("/c2/hello")
    public String hello2(@RequestParam("username") String name, ModelMap model){
        model.addAttribute("msg",name);
        System.out.println(name);
        return "test";
    }

    @RequestMapping("/e/t")
    public String test(Model model,String name){
        model.addAttribute("msg",name); // 获取表单提交的数据
        return "test";
    }
}
