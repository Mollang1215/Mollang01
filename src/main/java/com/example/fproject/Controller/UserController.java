package com.example.fproject.controller;


import com.example.fproject.Dto.UserDTO;
import com.example.fproject.Service.UserService;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@Controller
public class UserController {


  UserService userService;


    @RequestMapping("/login")
    public String login(){
        return "member/member_login";
    }

    @RequestMapping("/loginaction")
    public String loginaction(){

        return "redirect:/";
    }


        @RequestMapping("/joinform")
        public String joinform(UserDTO userDTO){

        return "join/joinform";
        }

    @RequestMapping("/postjoin")          // 회원가입 액션
    public String insertjoin(UserDTO userDTO) {
         userService.savejoin(userDTO);
            return "redirect:/login";
        }
    }

