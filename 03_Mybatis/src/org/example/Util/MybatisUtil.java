package org.example.Util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    private MybatisUtil(){}

    private static SqlSessionFactory sqlSessionFactory = null;

    //创建sqlSessionFactory
    static {
        String resource = "resources/mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<>();
    //创建sqlSession对象
    public static SqlSession getSqlSession(){
        SqlSession session = threadLocal.get();
        if(session == null){
            session = sqlSessionFactory.openSession();
            threadLocal.set(session);
        }
        return session;
    }

    //关闭sqlSession对象
    public static void myClose(SqlSession session){
        if(session != null){
            session.close();
            threadLocal.remove();
        }
    }


}
