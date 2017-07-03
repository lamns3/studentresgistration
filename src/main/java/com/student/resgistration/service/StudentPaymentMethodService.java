package com.student.resgistration.service;

import java.util.List;

import com.student.resgistration.model.StudentPaymentMethod;

public interface StudentPaymentMethodService {
	public boolean addStudentPaymentMethod(StudentPaymentMethod studentPaymentMethod);
	public boolean updateStudentPaymentMethod(StudentPaymentMethod studentPaymentMethod);
	public List<StudentPaymentMethod> listStudentPaymentMethod();
	public StudentPaymentMethod getStudentPaymentMethodId(int studentPaymentMethodId);
	public boolean removeStudentPaymentMethod(int studentPaymentMethodId);
}
