package com.java_ssm.entity;

import org.springframework.util.ClassUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

public class Upload {
    private String name;
    private String suffix;
    private String path;
    private long size;

    public String setFile(MultipartFile file, HttpServletRequest request, String uploader) {
        String location = System.getProperty("user.dir")+"\\src\\main\\resources\\static\\upload\\";
        String OriginalFilename  = file.getOriginalFilename(); // 文件名称
        String suffixName = OriginalFilename.substring(OriginalFilename.lastIndexOf('.'));
        String fileName = UUID.randomUUID()+suffixName;
        File files = new File(location+fileName);
        System.out.println(location+fileName);
        try {
            file.transferTo(files);
            return "\\upload\\"+fileName;
        } catch (IOException e) {
            e.printStackTrace();
            return "file upload error";
        }

    }
    // 暂无使用
    public class  FileObj{
        private String path;
        public String getPath(){
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }
    }
    public String getUploadPath() {
        return path;
    }
}
