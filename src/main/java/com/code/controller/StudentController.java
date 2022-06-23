package com.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.code.model.Student;
import com.code.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired StudentService studentService;
	
	@GetMapping("/id")
	public Student getById(@RequestParam(value ="id", defaultValue="1") int id) {
		return studentService.getById(id);
	}

	@RequestMapping(value = "/name", method = RequestMethod.GET)
	public Student getByName(@RequestParam(value = "name", defaultValue = "Omer") String name) {
		return studentService.getByName(name);
	}
	
	@PostMapping("/save")
	public boolean saveStudent(@RequestBody(required = true) Student student) {
		return studentService.save(student);
	}
}
