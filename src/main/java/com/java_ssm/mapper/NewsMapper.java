package com.java_ssm.mapper;

import com.java_ssm.entity.News;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsMapper {
//    @Insert("INSERT INTO news(id,title,image,desc,url,create_time,content) values(" + "#{id},#{title},#{image},#{desc},#{url},#{create_time},#{content})")
    public Boolean addNews(News news);

    public Boolean delNews(String id);

    public Boolean editNews(News news);
    @Select("select * from news")
    public List<News> findNews();

    public News findOneNews(String id);

}
