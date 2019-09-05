package com.sursatech.people_mgmt.dao;


import java.util.concurrent.CompletableFuture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;

import com.sursatech.people_mgmt.entities.Person;

public interface PeopleMgmtDao extends CrudRepository<Person, Integer> {

	@Async
	CompletableFuture<Person> findByEmail(String email);

}
