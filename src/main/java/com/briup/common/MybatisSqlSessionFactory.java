package com.briup.common;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/**
 * ����mybais��SQLSession����
 * */
public class MybatisSqlSessionFactory {
	private static String CONFIG_FILE_LOCATION = "mybatis-config.xml";
	private static final ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();
    private static SqlSessionFactory sessionFactory;
    private static String configFile = CONFIG_FILE_LOCATION;
    static {
    	try {
    		InputStream stream = Resources.getResourceAsStream(configFile);
			sessionFactory = new SqlSessionFactoryBuilder().build(stream);
		} catch (Exception e) {
			System.err.println("%%%% Error Creating SessionFactory %%%%");
			e.printStackTrace();
		}
    }
    private MybatisSqlSessionFactory() {
    }
	
    public static SqlSession getSession()  {
    	SqlSession session = getSession(false);
    	return session;
    }
    public static SqlSession getSession(boolean autoCommit)  {
    	SqlSession sqlSession = threadLocal.get();
		if (sqlSession == null) {
			if (sessionFactory == null) {
				rebuildSessionFactory();
			}
			sqlSession = (sessionFactory != null) ? sessionFactory.openSession(autoCommit)
					: null;
			threadLocal.set(sqlSession);
		}

        return sqlSession;
    }

	public static void rebuildSessionFactory() {
		try {
			InputStream stream = Resources.getResourceAsStream(configFile);
			sessionFactory = new SqlSessionFactoryBuilder().build(stream);
		} catch (Exception e) {
			System.err.println("%%%% Error Creating SessionFactory %%%%");
			e.printStackTrace();
		}
	}

    public static void closeSession(){
        SqlSession session = threadLocal.get();
        threadLocal.set(null);

        if (session != null) {
            session.close();
        }
    }

	public static SqlSessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void setConfigFile(String configFile) {
		MybatisSqlSessionFactory.configFile = configFile;
		sessionFactory = null;
	}
}
