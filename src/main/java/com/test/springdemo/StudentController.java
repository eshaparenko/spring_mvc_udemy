package com.test.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController
{
    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;

    @RequestMapping("/showForm")
    public String showForm(Model model){
        Student student = new Student();
            model.addAttribute("student", student);
        model.addAttribute("countryOptions", countryOptions);
        return "student-form";
    }
    @RequestMapping(value = "/processForm")
    public String processForm(@ModelAttribute("student") Student student){
        System.out.println("Student: " + student.getFirstName()+" "+student.getLastName());
        return "student-confirmation";
    }
}
