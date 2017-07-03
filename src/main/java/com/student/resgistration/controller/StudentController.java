package com.student.resgistration.controller;

import java.util.List;

import com.student.resgistration.model.Student;

public interface StudentController {
	public boolean addStudent(Student student);
	public boolean updateStudent(Student student);
	public List<Student> listStudent();
	public Student getStudentById(int studentId);
	public boolean removeStudent(int studentId);
}
