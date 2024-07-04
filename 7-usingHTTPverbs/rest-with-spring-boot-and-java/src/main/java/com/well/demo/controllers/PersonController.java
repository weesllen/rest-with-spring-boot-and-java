package com.well.demo.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.well.demo.model.Person;
import com.well.demo.services.PersonServices;

@RestController
@RequestMapping("/person")
public class PersonController {
	
		@Autowired
		private PersonServices service;
	

		@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
		public List <Person> findAll(){
			return service.findAll();			
	}
		
		
		@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
		public Person findById( @PathVariable(value = "id") String id) {
			return service.findById(id);			
		}
		
		@RequestMapping(method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
		public Person create( @RequestBody Person person){
			return service.create(person);	
		}
	
		@RequestMapping(method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
		public Person update( @RequestBody Person person){
			return service.update(person);			
		}
		@RequestMapping(method = RequestMethod.DELETE, value  = "/{id}")
		public void delete( @PathVariable(value = "id") String id) {
			
		}
}
		
			
		
		
				
		
		
