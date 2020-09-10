package pl.airq.dbmigration;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.StartupEvent;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class StopAppAfterInitialization {

    private static final Logger LOGGER = LoggerFactory.getLogger(StopAppAfterInitialization.class);

    void onStartup(@Observes StartupEvent event) {
        LOGGER.info("Stopping quarkus application...");
        Quarkus.asyncExit(0);
    }
}
