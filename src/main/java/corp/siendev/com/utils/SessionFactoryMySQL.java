package corp.siendev.com.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Helper class for build session factory (mysql) from hibernate.cfg.xml
 *
 * @author Golubnichenko Yuriy
 */
public class SessionFactoryMySQL
{
    private static final SessionFactory sessionFactoryMySql = new Configuration().configure().buildSessionFactory();

    public static SessionFactory getSessionFactoryMySql()
    {
        return sessionFactoryMySql;
    }

    public static void closeSessionFactoryMySQL()
    {
        sessionFactoryMySql.close();
    }
}
