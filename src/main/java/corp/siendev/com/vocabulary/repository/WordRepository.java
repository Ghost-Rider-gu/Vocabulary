package corp.siendev.com.vocabulary.repository;

import corp.siendev.com.vocabulary.model.WordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for work with words.
 *
 * @author Golubnichenko Yuriy
 */
@Repository
public interface WordRepository extends JpaRepository<WordEntity, Integer> {


}
