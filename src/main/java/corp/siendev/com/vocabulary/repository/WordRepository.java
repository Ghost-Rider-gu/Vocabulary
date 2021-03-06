/*
 * Copyright (c) 2018. SienDev, Inc. and Golubnichenko Yuriy.  All Rights Reserved.
 */

package corp.siendev.com.vocabulary.repository;

import corp.siendev.com.vocabulary.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for work with words.
 *
 * @author Golubnichenko Yuriy
 */
@Repository
public interface WordRepository extends JpaRepository<Word, Long> {

}
