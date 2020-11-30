/*package com.example.fproject.Service;

import com.example.fproject.Dto.FileDTO;
import com.example.fproject.Entity.File;
import com.example.fproject.Repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileService {

    @Autowired
    private FileRepository fileRepository;

    public Long save(FileDTO fileDTO){
        return fileRepository.save(fileDTO.toEntity()).getId();
    }

    public FileDTO getFile(Long id){
        File file = fileRepository.findById(id).get();

        FileDTO fileDTO = FileDTO.builder()
                .id(id)
                .origFilename(file.getOrigFilename())
                .filename(file.getFilename())
                .filePath(file.getFilePath())
                .build();
        return fileDTO;
    }
}*/
