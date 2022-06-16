package com.java_ssm.entity;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

public class Upload {
    private String name;
    private String suffix;
    private String path;
    private long size;

    public boolean setFile(MultipartFile attach, HttpServletRequest request, String uploader) {
        String location = "D:\\java\\java_ssm\\src\\main\\resources\\static\\upload";
        System.out.println(attach);
        return true;
    }

    public String getUploadPath() {
        return path;
    }
}
