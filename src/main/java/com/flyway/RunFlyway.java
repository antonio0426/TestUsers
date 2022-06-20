package com.flyway;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.flywaydb.core.Flyway;
import org.jboss.logging.Logger;

import io.quarkus.arc.Priority;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class RunFlyway {

	@Inject
	Logger log;

	@ConfigProperty(name = "myapp.flyway.migrate")
	boolean runMigration;

	@ConfigProperty(name = "quarkus.datasource.reactive.url")
	String datasourceUrl;
	@ConfigProperty(name = "quarkus.datasource.username")
	String datasourceUsername;
	@ConfigProperty(name = "quarkus.datasource.password")
	String datasourcePassword;

	public void runFlywayMigration(@Observes StartupEvent event, StartUpTest startUpTest, StartUpTest2 startUpTest2,
			StartUpTest3 startUpTest3) {
		log.info("############################runFlywayMigration############################");
		if (runMigration) {
			Flyway flyway = Flyway.configure()
					.dataSource("jdbc:" + datasourceUrl, datasourceUsername, datasourcePassword).load();
			flyway.migrate();
		}
		startUpTest.runTest();
		startUpTest2.runTest();
		startUpTest3.runTest();
	}
}
