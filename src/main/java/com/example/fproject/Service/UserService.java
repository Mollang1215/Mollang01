package com.example.fproject.Service;


import com.example.fproject.Dto.UserDTO;
import com.example.fproject.Repository.UserRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class UserService {

    private UserRepository userRepository;

   @Transactional
    public Long savejoin(UserDTO userDTO){

        return userRepository.save(userDTO.toEntity()).getUser_code();
    }




}
