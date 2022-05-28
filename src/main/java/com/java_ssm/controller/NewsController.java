package com.java_ssm.controller;

import com.java_ssm.entity.News;
import com.java_ssm.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @PostMapping("/set")
    public Boolean set(@RequestBody News news) {
        Date date = new Date();
        SimpleDateFormat dataFormmat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        News newsData = new News();
        newsData.id = String.valueOf(System.currentTimeMillis()); // 时间戳id
        newsData.create_time = dataFormmat.format(date); // 格式化时间
        newsData.title = news.getTitle();
        newsData.image = news.getImage();
        newsData.desc = news.getDesc();
        newsData.url = news.getUrl();
        newsData.content = news.getContent();
        return newsService.addNews(newsData);
    }

    @GetMapping("/del")
    public Boolean del(@RequestParam String id) {
        return newsService.delNews(id);
    }

    @PostMapping("/edit")
    public Boolean edit(News news) {
        return newsService.editNews(news);
    }

    @GetMapping("/list")
    public List<News> list() {
        return newsService.findNews();
    }

    @GetMapping("/the")
    public News the(@RequestParam String id) {
        return newsService.findOneNews(id);
    }
}
