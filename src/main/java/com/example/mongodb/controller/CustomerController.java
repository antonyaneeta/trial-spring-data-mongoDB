package com.example.mongodb.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodb.pojo.Customers;
import com.example.mongodb.repository.MongoRepo;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

private MongoRepo mongoRepo;

	public CustomerController(MongoRepo mongoRepo) {
		this.mongoRepo = mongoRepo;
	}


	@GetMapping(value="/getall")
public 	List<Customers> getAllCustomers(){
	return mongoRepo.findAll();
}
    
}