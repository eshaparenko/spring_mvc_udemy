package com.test.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.LinkedHashMap;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController
{
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;

    @RequestMapping("/showForm")
    public String showForm(Model model){
        Student student = new Student();
            model.addAttribute("student", student);
        model.addAttribute("countryOptions", countryOptions);
        return "student-form";
    }
    @RequestMapping("/processForm")
    public String processForm(@Valid@ModelAttribute("student") Student student, BindingResult bindingResult){
        System.out.println("Student: " + student.getFirstName()+" "+student.getLastName());
        if (bindingResult.hasErrors()){
            return "student-form";
        }
        else {
            return "student-confirmation";
        }

    }
}
