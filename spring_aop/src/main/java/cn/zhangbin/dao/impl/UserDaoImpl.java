package cn.zhangbin.dao.impl;

import cn.zhangbin.dao.UserMapper;
import cn.zhangbin.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserMapper {

//    //sqlSession不用自己创建了,Spring来管理
//    private SqlSessionTemplate sqlSession;
//
//    public void setSqlSession(SqlSessionTemplate sqlSession) {
//        this.sqlSession = sqlSession;
//    }

    public List<User> selectUser() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        User user = new User(7,"小红","123456");
        mapper.addUser(user);
        mapper.deleteUser(7);
        return mapper.selectUser();
    }

    public int addUser(User user) {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.addUser(user);
    }

    public int deleteUser(int id) {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.deleteUser(id);
    }
}
