package com.example.fproject.Controller;

import com.example.fproject.Dto.FreeBoardDTO;
import com.example.fproject.service.FreeBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RController {

    @Autowired
    private FreeBoardService freeBoardService;


//    @RequestMapping("/jsonresult")
//    public ResponseEntity<List<FreeBoardDTO>> result(){
//        List<FreeBoardDTO> freeBoardDTOList = freeBoardService.getBoard();
//
//        ResponseEntity<List<FreeBoardDTO>> entity =
//                new ResponseEntity<List<FreeBoardDTO>>(freeBoardDTOList, HttpStatus.OK);
//
//        return entity;
//    }

    @RequestMapping("/jsonresult")
    public ResponseEntity result(){
        return ResponseEntity.ok(freeBoardService.getBoard());
    }
}
