package com.zhangbin.dao;

import com.zhangbin.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    //插入博客
    int addBlog(Blog blog);

    //根据作者名称/博客名称查询数据
    List<Blog> queryBlogIf(Map<String,Object> map);

    //修改数据
    int updateBlog(Map<String,Object> map);

    //当某一个查询满足条件后直接返回结果
    List<Blog> queryBlogChoose(Map<String,Object> map);

    // 分段查询
    List<Blog> queryBlogForeach(Map<String,Object> map);
}
