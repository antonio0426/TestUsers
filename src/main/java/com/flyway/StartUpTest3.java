package com.flyway;

import javax.enterprise.context.ApplicationScoped;
 
import javax.inject.Inject;
 
import org.jboss.logging.Logger;

 

@ApplicationScoped
public class StartUpTest3 {

	@Inject
	Logger log;

	public void runTest() {
		log.info("############################runTest3############################");

	}
}
