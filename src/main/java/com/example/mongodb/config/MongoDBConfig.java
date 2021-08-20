package com.example.mongodb.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.mongodb.pojo.Customers;
import com.example.mongodb.repository.MongoRepo;

@EnableMongoRepositories(basePackageClasses = MongoRepo.class)
@Configuration
public class MongoDBConfig {


	    @Bean
	    CommandLineRunner commandLineRunner(MongoRepo mongoRepo){
	        return new CommandLineRunner() {
	            @Override
	            public void run(String... args) throws Exception {
	                mongoRepo.save(new Customers("Aneeta", "Antony"));
	                mongoRepo.save(new Customers("Xavier", "Antony"));
	            }
	        };


	    }
	}

