/*
 * Copyright (c) 2021. SienDev, Inc. and Golubnichenko Iurii.  All Rights Reserved.
 */

package corp.siendev.com.verbarium.repository;

import corp.siendev.com.verbarium.domain.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

}
