package corp.siendev.com.vocabulary.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Initial before load application.
 *
 * @author Golubnichenko Yuriy
 */
@Slf4j
@Component
public class InitLoadApp implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("Initialization data ...");
    }

}
