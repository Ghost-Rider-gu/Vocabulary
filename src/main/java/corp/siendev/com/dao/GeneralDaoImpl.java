package corp.siendev.com.dao;

import corp.siendev.com.exception.VocabularyDaoException;
import corp.siendev.com.models.BaseEntity;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Implementation for GeneralDao interface (physical  CRUD)
 *
 * @author Golubnichenko Yuriy
 */
@Repository
@Transactional(readOnly = true)
@Slf4j
public class GeneralDaoImpl <T extends BaseEntity> implements GeneralDao <T>
{
    @Autowired
    private SessionFactory mySQLFactory;

    @Override
    @Transactional(readOnly = false)
    public void createEntity(T entity) throws VocabularyDaoException
    {
        Session mySQLSession = mySQLFactory.openSession();
        mySQLSession.save(entity);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<T> getAllEntity(String entity) throws VocabularyDaoException
    {
        Session mySQLSession = mySQLFactory.openSession();
        String hql = "FROM " + entity;
        Query query = mySQLSession.createQuery(hql);
        List<T> dataEntity = query.list();

        Criteria criteria;

        return dataEntity;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T getEntity(String entity) throws VocabularyDaoException
    {
        Session mySQLSession = mySQLFactory.openSession();
        String hql = "";
        Query query = mySQLSession.createQuery(hql);
        //T dataEntity = query.getSingleResult();
        return null;
    }

    @Override
    @Transactional(readOnly = false)
    public void updateEntity(T entity) throws VocabularyDaoException
    {
        Session mySQLSessoin = mySQLFactory.openSession();
        mySQLSessoin.saveOrUpdate(entity);
    }

    @Override
    @Transactional(readOnly = false)
    public void deleteEntity(T entity) throws VocabularyDaoException
    {
        Session mySQLSession = mySQLFactory.openSession();
        mySQLSession.delete(entity);
    }
}
