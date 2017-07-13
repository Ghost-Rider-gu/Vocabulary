package corp.siendev.com.dao;

import corp.siendev.com.exception.VocabularyDaoException;
import corp.siendev.com.models.BaseEntity;

import java.util.List;

/**
 * Generic interface for DAO (with CRUD)
 *
 * @author Golubnichenko Yuriy
 */
public interface GeneralDao <T extends BaseEntity>
{
    /**
     * Create new one of entity (user, word, profile, word category)
     *
     * @param entity appropriate entity
     *
     * @throws VocabularyDaoException Exception
     */
    void createEntity(T entity) throws VocabularyDaoException;

    /**
     * Get get list one of entity (user, word, profile, word category)
     *
     * @param entity appropriate entity
     *
     * @return List of entity
     *
     * @throws VocabularyDaoException Exception
     */
    List<T> getAllEntity(String entity) throws VocabularyDaoException;

    /**
     * Get entity (user, word, profile, word category)
     *
     * @param entity appropriate entity
     *
     * @return Entity
     *
     * @throws VocabularyDaoException Exception
     */
    T getEntity(String entity) throws VocabularyDaoException;

    /**
     * Update one of entity (user, word, profile, word category)
     *
     * @param entity appropriate entity
     *
     * @throws VocabularyDaoException Exception
     */
    void updateEntity(T entity) throws VocabularyDaoException;

    /**
     * Delete one of entity (user, word, profile, word category)
     *
     * @param entity appropriate entity
     *
     * @throws VocabularyDaoException Exception
     */
    void deleteEntity(T entity) throws VocabularyDaoException;
}
