package corp.siendev.com.vocabulary.repository;

import corp.siendev.com.vocabulary.model.WordEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for work with words.
 *
 * @author Golubnichenko Yuriy
 */
@Repository
public interface WordRepository extends CrudRepository<WordEntity, Integer> {


}
