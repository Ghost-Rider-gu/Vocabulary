package corp.siendev.com.vocabulary.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Initial before load application.
 *
 * @author Golubnichenko Yuriy
 */
@Slf4j
@Component
public class InitLoadApp implements CommandLineRunner {

    @Autowired
    private DataSource ds;

    @Override
    public void run(String... args) throws Exception {
        log.info("Initialization data ...");
        log.info(ds.toString());
    }

    @Scheduled(initialDelay = 10000, fixedRate = 10000)
    public void run() {
        log.info("test");
    }
}
