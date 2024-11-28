package com.tka.SpringDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.SpringDB.entity.Student;
import com.tka.SpringDB.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;

	@PostMapping("/savedata")
	public String InsertData(@RequestBody Student s) {
		String msg = service.InsertData(s);
		return msg;
	}

	@DeleteMapping("/deleteData/{id}")
	public String deleteData(@PathVariable int id) {
		String msg = service.deleteData(id);
		return msg;
	}

	@GetMapping("/getsingledata/{id}")
	public Student getSingleData(@PathVariable int id) {
		Student student = service.getSingleData(id);
		return student;
	}

	@GetMapping("/getalldata")
	public List<Student> getalldata() {
		return service.getalldata();
	}

}
