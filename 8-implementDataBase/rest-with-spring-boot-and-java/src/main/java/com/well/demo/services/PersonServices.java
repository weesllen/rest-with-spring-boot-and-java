package com.well.demo.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.well.demo.exceptions.ResourceNotFoundException;
import com.well.demo.model.Person;
import com.well.demo.repositories.PersonRepository;



@Service
public class PersonServices {
	
		private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
		@Autowired
		PersonRepository repository;
		
		
	
		public List<Person> findAll() {
		
		logger.info("Finding all People!!");
		return repository.findAll();
		
	}
	
		public Person findById(Long id) {
			
		logger.info("Finding one Person!!");	
		 var entity = repository.findById(id) 
					.orElseThrow(() -> new ResourceNotFoundException(" No records for this ID"));
		 return entity;
	}
			
		public Person create(Person person) {
			
			logger.info("Creating one Person!!");
			
			return repository.save(person);	
	}
		
		
		public Person update(Person person) {
			
			logger.info("Updating one Person!!");
			Person entity = repository.findById(person.getId())
					.orElseThrow(() -> new ResourceNotFoundException(" No records for this ID"));
			
			entity.setFirstName(person.getFirstName());
			entity.setLastName(person.getLastName());
			entity.setAddress(person.getAddress());
			entity.setGender(person.getGender());
	
			return repository.save(entity);
			
	}
		public void delete(Long id) {
			logger.info("Deleting one Person!!");
			Person entity = repository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException(" No records for this ID"));
			repository.delete(entity);
				
	}
	}