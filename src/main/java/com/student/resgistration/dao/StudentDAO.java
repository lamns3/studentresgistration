package com.student.resgistration.dao;

import java.util.List;

import com.student.resgistration.model.Student;

public interface StudentDAO {
	public boolean addStudent(Student student);
	public boolean updateStudent(Student student);
	public List<Student> listStudent();
	public Student getStudentById(int studentId);
	public boolean removeStudent(int studentId);
}
