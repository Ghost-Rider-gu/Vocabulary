package corp.siendev.com.vocabulary;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Vocabulary application invoker.
 *
 * @author Golubnichenko Yuriy
 */
@Slf4j
@SpringBootApplication
public class VocabularyApplication {

    public static void main(String args[]) {
        log.info("Start application");
        SpringApplication.run(VocabularyApplication.class, args);
    }

}
