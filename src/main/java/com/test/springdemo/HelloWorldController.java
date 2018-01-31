package com.test.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController
{
    @RequestMapping("/showForm")
    public String showForm(){
        return "hello-worldform";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processFormVersion2")
    public String letsShoutDude(@RequestParam("studentName")String theName, Model model){
        String result = "Hello from v3 " + theName.toUpperCase();
        model.addAttribute("message", result);
        return "helloworld";
    }

    @RequestMapping("/processFormVersion3")
    public String processFormVersion3(HttpServletRequest request, Model model){
        String theName = request.getParameter("studentName");
        String result = "Yo " + theName.toUpperCase();
        model.addAttribute("message", result);
        return "helloworld";
    }
}
