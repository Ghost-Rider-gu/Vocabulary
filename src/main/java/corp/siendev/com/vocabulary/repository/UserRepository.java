package corp.siendev.com.vocabulary.repository;

import corp.siendev.com.vocabulary.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * User repository.
 *
 * @author Golubnichenko Yuriy
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
