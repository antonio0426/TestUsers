package com.flyway;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import io.quarkus.arc.Priority;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class StartUpTest5 {

	@Inject
	Logger log;

	public void startUpTest(@Observes @Priority(4) StartupEvent event) {
		
		log.info("############################startUpTest4############################");
	}

}
