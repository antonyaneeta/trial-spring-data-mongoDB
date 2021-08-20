package com.example.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.mongodb.pojo.Customers;

import java.util.List;

@Repository
public interface MongoRepo extends MongoRepository<Customers, String> {
	/*
	 * public Customer findByFirstName(String firstName); public List<Customer>
	 * findByLastName(String lastName);
	 */
}