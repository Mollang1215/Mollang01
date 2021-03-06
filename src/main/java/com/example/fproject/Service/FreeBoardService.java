/*
package com.example.fproject.Service;

import com.example.fproject.Dto.FreeBoardDTO;
import com.example.fproject.Entity.FreeBoard;
import com.example.fproject.Repository.FreeBoardRepository;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class FreeBoardService {

    @Autowired
    private FreeBoardRepository freeBoardRepository;

//    @Autowired
//    private MultipartFile multipartFile;

    public Long save(FreeBoardDTO freeBAardDTO){

//        try{
//            String basedir = "C:\\Users\\Administrator\\IdeaProjects\\finalproject\\src\\main\\resources\\static\\upload";
//            String filePath = basedir + "\\" + multipartFile.getOriginalFilename();
//            multipartFile.transferTo(new File(filePath));
//            freeBoardDTO.setAdd_file(filePath);
//        } catch (Exception e){
//            e.printStackTrace();
//        }

        return freeBoardRepository.save(freeBoardDTO.toEntity()).getList_code();
    }

    public List<FreeBoardDTO> getBoard(){
//        Gson gson = new Gson();
        List<FreeBoard> freeBoardList = freeBoardRepository.findAll();
        List<FreeBoardDTO> freeBoardDTOList = freeBoardList.stream().map(freeBoard -> {
            FreeBoardDTO freeBoardDTO = new FreeBoardDTO();
            freeBoardDTO.setList_title(freeBoard.getList_title());
            freeBoardDTO.setAdd_file(freeBoard.getAdd_file());
            freeBoardDTO.setList_content(freeBoard.getList_content());
            return freeBoardDTO;
        }).collect(Collectors.toList());

//        String freeBoardDTOList = gson.toJson(freeBoardList);
//        for(FreeBoard freeBoard : freeBoardList){
//            FreeBoardDTO freeBoardDTO = FreeBoardDTO.builder()
//                    .list_title(freeBoard.getList_title())
//                    .add_file(freeBoard.getAdd_file())
//                    .list_content(freeBoard.getList_content())
//                    .build();
//            freeBoardDTOList.add(freeBoardDTO);
//        }
        return freeBoardDTOList;
    }
}
*/
