package com.code.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.model.Student;
import com.code.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	

	@Override
	public Student getById(int id) {
		Student s = new Student();
		s.setId(id);
		s.setName("name-" + id);
		s.setEmail("name-" + id + "@email.com");
		s.setMobileNo("1111111111");
		return s;
	}

	@Override
	public Student getByName(String name) {
		Student s = new Student();
		s.setId(2);
		s.setName(name);
		s.setEmail(name +"-2@email.com");    
		s.setMobileNo("2222222222");
		return s;
	}

	@Override
	public boolean save(Student student) {
		System.out.println("id- " + student.getId()+ ", name- " + student.getName() + ", email- " + student.getEmail() + ", mobile- " + student.getMobileNo());
		return true;
	}
	

}
