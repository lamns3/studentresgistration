package com.student.resgistration.controller;

import java.util.List;

import com.student.resgistration.model.StudentPaymentMethod;

public interface StudentPaymentMethodController {
	public boolean addStudentPaymentMethod(StudentPaymentMethod studentPaymentMethod);
	public boolean updateStudentPaymentMethod(StudentPaymentMethod studentPaymentMethod);
	public List<StudentPaymentMethod> listStudentPaymentMethod();
	public StudentPaymentMethod getStudentPaymentMethodId(int studentPaymentMethodId);
	public boolean removeStudentPaymentMethod(int studentPaymentMethodId);
}
