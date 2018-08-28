/*
 * Copyright (c) 2018. SienDev, Inc. and Golubnichenko Yuriy.  All Rights Reserved.
 */

package corp.siendev.com.vocabulary;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Date;

/**
 * Vocabulary application invoker.
 *
 * @author Golubnichenko Yuriy
 */
@Slf4j
@EntityScan("corp.siendev.com.vocabulary.model")
@EnableJpaRepositories("corp.siendev.com.vocabulary.repository")
@EnableScheduling
@SpringBootApplication
@EnableJpaAuditing
public class VocabularyApplication {

    public static void main(String[] args) {
        log.info("Start application: " + new Date());
        SpringApplication.run(VocabularyApplication.class, args);
    }
}
