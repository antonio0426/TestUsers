package com.test;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class TestService {

	
	public List<DrgUser> getAllUsers() {
		
		return DrgUser.listAll();
	}
}
