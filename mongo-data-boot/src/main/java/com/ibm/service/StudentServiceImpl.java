package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.model.Student;
import com.ibm.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repo;
	@Override
	public void add(Student s) {
		// TODO Auto-generated method stub
		repo.save(s);
	}

	@Override
	public Student fetch(int rollno) {
		// TODO Auto-generated method stub
		return repo.findById(rollno).get();
	}

	@Override
	public List<Student> list() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Student> listBySchool(String school) {
		// TODO Auto-generated method stub
		return repo.findAllBySchool(school);
	}
	
}
