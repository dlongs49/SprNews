package com.java_ssm.controller;
import com.java_ssm.entity.News;
import com.java_ssm.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;
    @PostMapping("/set")
    public Boolean set(News news){
        return newsService.addNews(news);
    }
    @GetMapping("/del")
    public Boolean del(@RequestParam String id){
        return newsService.delNews(id);
    }
    @PostMapping("/edit")
    public Boolean edit(News news){
        return newsService.editNews(news);
    }
    @GetMapping("/list")
    public List<News> list(){
        return newsService.findNews();
    }
    @GetMapping("/the")
    public News the(@RequestParam String id){
        return newsService.findOneNews(id);
    }
}
