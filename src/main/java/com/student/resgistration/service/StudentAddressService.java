package com.student.resgistration.service;

import java.util.List;

import com.student.resgistration.model.StudentAddress;

public interface StudentAddressService {
	public boolean addStudentAddress(StudentAddress studentAddress);
	public boolean updateStudentAddress(StudentAddress studentAddress);
	public List<StudentAddress> listStudentAddress();
	public StudentAddress getStudentAddressById(int studentAddressId);
	public boolean removeStudentAddress(int SstudentAddressId);
}
