package com.sursatech.people_mgmt;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import com.sursatech.people_mgmt.entities.Person;
import com.sursatech.people_mgmt.service.PeopleMgmtService;


@SpringBootApplication
@EnableAsync
public class Application implements CommandLineRunner{
	
	@Autowired
	private PeopleMgmtService peopleMgmtService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);}

	@Override
	public void run(String... args) throws Exception {		
		CompletableFuture<Person> completableFuture = peopleMgmtService.findByEmail("test1user@gmail.com");
		Person person = completableFuture.get(10, TimeUnit.SECONDS);
		System.out.println(person);
	}
}
