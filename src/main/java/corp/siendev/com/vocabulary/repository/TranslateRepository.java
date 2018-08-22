/*
 * Copyright (c) 2018. SienDev, Inc. and Golubnichenko Yuriy.  All Rights Reserved.
 */

package corp.siendev.com.vocabulary.repository;

import corp.siendev.com.vocabulary.model.Translate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Translate repository.
 *
 * @author Golubnichenko Yuriy
 */
@Repository
public interface TranslateRepository extends JpaRepository<Translate, Long> {

}
