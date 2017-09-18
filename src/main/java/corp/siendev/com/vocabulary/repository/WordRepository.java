package corp.siendev.com.vocabulary.repository;

import corp.siendev.com.vocabulary.model.WordEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Repository for work with words.
 *
 * @author Golubnichenko Yuriy
 */
@Repository
@Transactional
public interface WordRepository extends CrudRepository<WordEntity, Integer> {

    List<WordEntity> findByMonth();
    List<WordEntity> findByYear();
}
