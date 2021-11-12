/*
 * Copyright (c) 2021. SienDev, Inc. and Golubnichenko Iurii.  All Rights Reserved.
 */

package corp.siendev.com.verbarium.repository;

import corp.siendev.com.verbarium.domain.WordType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WordTypeRepository extends JpaRepository<WordType, Long> {
    Optional<WordType> findWordTypeByTypeName(String typeName);
}
