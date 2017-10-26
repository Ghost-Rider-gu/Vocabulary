package corp.siendev.com.vocabulary.repository;

import corp.siendev.com.vocabulary.model.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * User profile repository.
 *
 * @author Golubnichenko Yuriy
 */
@Repository
public interface ProfileRepository extends JpaRepository<ProfileEntity, Integer> {

}
