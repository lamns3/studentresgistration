/**
 * 
 */
package com.student.resgistration.dao;

import java.util.List;
import com.student.resgistration.model.StudentAddress;

/**
 * @author LamNS3
 *
 */
public interface StudentAddressDAO {
	public boolean addStudentAddress(StudentAddress studentAddress);
	public boolean updateStudentAddress(StudentAddress studentAddress);
	public List<StudentAddress> listStudentAddress();
	public StudentAddress getStudentAddressById(int studentAddressId);
	public boolean removeStudentAddress(int SstudentAddressId);
}
