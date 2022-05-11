package com.test;

import java.util.List;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.smallrye.mutiny.Uni;

@Path("/test")
public class TestResource {

	private static final Logger log = LoggerFactory.getLogger(TestResource.class);

	@Inject
	private TestService testService;

	@GET
	@Path("/users")
	public Uni<List<DrgUser>> getAllUsers() {
		log.info("Start Chiamo la get");
		Uni<List<DrgUser>> l = testService.getAllUsers();
		log.info("End Chiamo la get");
		return l;
	}
}
