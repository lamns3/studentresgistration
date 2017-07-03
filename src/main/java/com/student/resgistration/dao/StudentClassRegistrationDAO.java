package com.student.resgistration.dao;

import java.util.List;
import com.student.resgistration.model.StudentClassRegistration;

public interface StudentClassRegistrationDAO {
	public boolean addStudentClassRegistration(StudentClassRegistration studentClassRegistration);
	public boolean updateStudentClassRegistration(StudentClassRegistration studentClassRegistration);
	public List<StudentClassRegistration> listStudentClassRegistration();
	public StudentClassRegistration getStudentClassRegistrationById(int studentClassRegistrationId);
	public boolean removeStudentClassRegistration(int studentClassRegistrationId);
}
