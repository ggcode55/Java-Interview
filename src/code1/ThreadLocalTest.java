package code1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Description :
 * ThreadLocal使用场景为 用来解决数据库连接、Session管理等
 * @Autoor: rocco
 * @date: 2019/3/9
 */
public class ThreadLocalTest {
    /**
     * 数据库连接
     */
    private static ThreadLocal<Connection> connectionThreadLocal=new ThreadLocal(){
        public Connection initValue() throws SQLException {
            return DriverManager.getConnection("");
        }
    };
    public static Connection getConnection(){
        return connectionThreadLocal.get();
    }

    /**
     * Session管理
     */

    private static final ThreadLocal threadSession = new ThreadLocal();

    /*public static Session getSession() throws InfrastructureException {
        Session s = (Session) threadSession.get();
        try {
            if (s == null) {
                s = getSessionFactory().openSession();
                threadSession.set(s);
            }
        } catch (HibernateException ex) {
            throw new InfrastructureException(ex);
        }
        return s;
    }*/
}
