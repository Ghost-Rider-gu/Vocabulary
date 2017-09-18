package corp.siendev.com.vocabulary.repository;

import corp.siendev.com.vocabulary.model.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Repository for work with users.
 *
 * @author Golubnichenko Yuriy
 */
@Repository
@Transactional
public interface UserRepository extends CrudRepository<UserEntity, Integer> {

    public List<UserEntity> findByLogin();
}
