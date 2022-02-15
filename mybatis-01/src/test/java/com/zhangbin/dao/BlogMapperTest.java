package com.zhangbin.dao;

import com.zhangbin.pojo.Blog;
import com.zhangbin.util.IDUtil;
import com.zhangbin.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

public class BlogMapperTest {
//    @Test
//    public void addInitBlog(){
//        SqlSession session = MybatisUtils.getSession();
//        BlogMapper mapper = session.getMapper(BlogMapper.class);
//        Blog blog = new Blog();
//        blog.setId(IDUtil.genId());
//        blog.setTitle("MyBatis如此简单");
//        blog.setAuthor("张斌");
//        blog.setCreateTime(new Date());
//        blog.setViews(9999);
//        mapper.addBlog(blog);
//
//        blog.setId(IDUtil.genId());
//        blog.setTitle("Java如此简单");
//        mapper.addBlog(blog);
//
//        blog.setId(IDUtil.genId());
//        blog.setTitle("Spring如此简单");
//        mapper.addBlog(blog);
//
//        blog.setId(IDUtil.genId());
//        blog.setTitle("微服务如此简单");
//        mapper.addBlog(blog);
//
//        session.close();
//    }

    @Test
    public void testGetBlogByIf(){
        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("title",null);
        map.put("author","张斌");
        List<Blog> blogs = mapper.queryBlogIf(map);
        for (Blog blog : blogs) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String format1 = format.format(blog.getCreateTime());
            System.out.println("符合条件的数据的id为"+blog.getId()+"的博客标题为"+blog.getTitle()+",作者为:"+blog.getAuthor()+",创建时间为:"+format1);
        }
    }

    @Test
    public void testUpdateBlog(){
        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("title","Java如此简单个屁");
        map.put("author",null);
        map.put("id","5fdcd8206ba249a4a8308c03c330afd0");
        int i = mapper.updateBlog(map);
        System.out.println(i);
        session.close();
    }

    @Test
    public void testChooseBlog(){
        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("title","Java如此简单个屁");
        map.put("author","张斌");
        map.put("views",null);
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog.getTitle()+"作者为: "+blog.getAuthor());
        }
    }

    @Test
    public void testQueryBlogForeach(){
        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Map<String,Object> map = new HashMap<String, Object>();
        List<String> ids = new ArrayList<String>();
        ids.add("5");
        ids.add("6");
        map.put("ids",ids);
        List<Blog> blogs = mapper.queryBlogForeach(map);
        for (Blog blog : blogs) {
            System.out.println("满足条件的数据标题为: "+blog.getTitle());
        }
    }
}
