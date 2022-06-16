package com.java_ssm.controller;

import com.java_ssm.entity.Upload;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
@RestController
public class UploadController {
    @PostMapping("/upload")
    public String Upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        Upload upload = new Upload();
        String fileName = "00";
        upload.setFile(file, request,"uploadImg");
//        if (upload.setFile(file, request,"uploadImg")) {
//            fileName = upload.getUploadPath();
//        }
        return fileName;
    }
}
