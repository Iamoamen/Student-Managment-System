package com.studentmanagment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studentmanagment.entity.Student;

public interface StudentService {

	public List<Student> getAllStudent();

	public Student saveStudent(Student student);
	
	public Student getStudentById(Long id) ;
	
	public Student updateStudent(Student student);
	
	public void deleteStudentById(Long id) ;

}
