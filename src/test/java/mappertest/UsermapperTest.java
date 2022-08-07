package mappertest;


import com.xspring.mapper.UserMapper;
import com.xspring.pojo.User;
import com.xspring.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UsermapperTest {
   //增加
    @Test
    public void testInsertUser(){
        //连接数据库以session传输
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //通过代理模式创建UserMapper接口的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，
        //通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句
        User user = new User();
        user.setId(null);
        user.setName("xzw1");
        user.setPwd("123");
        int result = mapper.insertUser(user);
        System.out.println(result);
        sqlSession.close();
    }
    //删除
    @Test
    public void testDeleteUser(){
        //连接数据库以session传输
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //通过代理模式创建UserMapper接口的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，
        //通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句
        int result = mapper.deleteUser(3);
        System.out.println(result);
        sqlSession.close();
    }
    //修改
    @Test
    public void testUpdateUser(){
        //连接数据库以session传输
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //通过代理模式创建UserMapper接口的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，
        //通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句
        User user = new User();
        user.setId(2);
        user.setName("lwj1");
        user.setPwd("123");
        int result = mapper.updateUser(user);
        System.out.println(result);
        sqlSession.close();
    }
    //查询一条数据
    @Test
    public void testGetUserById(){
        //连接数据库以session传输
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //通过代理模式创建UserMapper接口的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，
        //通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }
    //查询所有数据
    @Test
    public void testGetAllUser(){
        //连接数据库以session传输
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //通过代理模式创建UserMapper接口的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，
        //通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句
        List<User> list = mapper.getAllUser();
        System.out.println(list);
        sqlSession.close();
    }
}
