package corp.siendev.com.dao;

import corp.siendev.com.exception.VocabularyDaoException;
import corp.siendev.com.models.BaseEntity;

import java.util.List;

/**
 * Implementation for GeneralDao interface (physical  CRUD)
 *
 * @author Golubnichenko Yuriy
 */
public class GeneralDaoImpl <T extends BaseEntity> implements GeneralDao <T>
{
    @Override
    public void createEntity(T entity) throws VocabularyDaoException {

    }

    @Override
    public List<T> getEntity(T entity) throws VocabularyDaoException {
        return null;
    }

    @Override
    public void updateEntity(T entity) throws VocabularyDaoException {

    }

    @Override
    public void deleteEntity(T entity) throws VocabularyDaoException
    {

    }
}
