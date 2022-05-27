package com.java_ssm.service;

import com.java_ssm.entity.News;
import com.java_ssm.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    private NewsMapper newsMapper;

    public Boolean addNews(News news){
        System.out.println(news);
        return newsMapper.addNews(news);
    }
    public Boolean delNews(String id){
        return newsMapper.delNews(id);
    }
    public Boolean editNews(News news){
        return newsMapper.editNews(news);
    }
    public List<News> findNews(){
        return newsMapper.findNews();
    }
    public News findOneNews(String id){
        return newsMapper.findOneNews(id);
    }
}
