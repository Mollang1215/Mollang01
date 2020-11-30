package com.example.fproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("Template")
    public String template(){

        return"template/template";
    }
}
