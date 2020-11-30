package com.example.fproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/test")
    public String test() {
        return "/template/template";
    }

    @GetMapping("/")
    public String main(Model request){
        //request.addAttribute("pp", "../main/main.jsp");

        return "template/template";
    }

    @GetMapping("/te")
    public String te(){
        return "/view/template/template";
    }
}
