package com.student.resgistration.service;

import java.util.List;

import com.student.resgistration.model.Student;

public interface StudentService {
	public boolean addStudent(Student student);
	public boolean updateStudent(Student student);
	public List<Student> listStudent();
	public Student getStudentById(int studentId);
	public boolean removeStudent(int studentId);
}
