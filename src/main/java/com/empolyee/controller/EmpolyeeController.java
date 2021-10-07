package com.empolyee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.empolyee.entity.Empolyee;
import com.empolyee.repositrey.EmployeeRepo;

@RestController
@CrossOrigin
public class EmpolyeeController {
	@Autowired
	private EmployeeRepo repository;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello word";
	}
	
	@PostMapping("/addemployee")
	  Empolyee newEmployee(@RequestBody Empolyee newEmployee) {
	    return repository.save(newEmployee);
	  }
	
	@GetMapping("/showempolyee")
	public List<Empolyee> getstudent(){
		return this.repository.findAll();	
	}
	
	
	@GetMapping("/employee/{id}")
	public Optional<Empolyee> getstudents(@PathVariable("id") int id) {
		return this.repository.findById(id);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletestudent(@PathVariable("id") int id) {
		repository.deleteById(id);
	}
	
	@PutMapping("/update")
	public Empolyee update(@RequestBody Empolyee newUser) {
		return repository.save(newUser);
	}
}
