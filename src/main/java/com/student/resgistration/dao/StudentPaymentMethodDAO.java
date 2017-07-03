package com.student.resgistration.dao;

import java.util.List;

import com.student.resgistration.model.StudentPaymentMethod;


public interface StudentPaymentMethodDAO {
	public boolean addStudentPaymentMethod(StudentPaymentMethod studentPaymentMethod);
	public boolean updateStudentPaymentMethod(StudentPaymentMethod studentPaymentMethod);
	public List<StudentPaymentMethod> listStudentPaymentMethod();
	public StudentPaymentMethod getStudentPaymentMethodId(int studentPaymentMethodId);
	public boolean removeStudentPaymentMethod(int studentPaymentMethodId);
}
