package com.jiang.mapper;

import com.jiang.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    //插入数据
    int addBlog(Blog blog);

    //查询博客
    List<Blog> queryBlogIF(Map map);

    //trim--where
    List<Blog> queryBlogChoose(Map map);

    //trim--set   跟新博客
    int updateBlog(Map map);

    //foreach   查询id为1,2,3的数据
    List<Blog> queryBlogForeach(Map map);
}
