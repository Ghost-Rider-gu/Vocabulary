/*
 * Copyright (c) 2021. SienDev, Inc. and Golubnichenko Iurii.  All Rights Reserved.
 */

package corp.siendev.com.verbarium.repository;

import corp.siendev.com.verbarium.domain.WordCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WordCategoryRepository extends JpaRepository<WordCategory, Long> {
    Optional<WordCategory> findWordCategoryByCategoryName(String categoryName);
}
