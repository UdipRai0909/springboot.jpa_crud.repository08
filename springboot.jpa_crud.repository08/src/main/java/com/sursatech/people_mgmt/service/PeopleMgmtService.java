package com.sursatech.people_mgmt.service;


import java.util.concurrent.CompletableFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sursatech.people_mgmt.dao.PeopleMgmtDao;
import com.sursatech.people_mgmt.entities.Person;

@Service
public class PeopleMgmtService {

	@Autowired
	private PeopleMgmtDao peopleMgmtDao;

	public CompletableFuture<Person> findByEmail(String email) {
		return peopleMgmtDao.findByEmail(email);
	}


}
