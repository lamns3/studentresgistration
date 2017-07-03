/**
 * 
 */
package com.student.resgistration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author LamNS3
 *
 */
@Entity
@Table(name="student_class_registrations")
public class StudentClassRegistration {
	@Id
	@Column(name="student_id")
	private int studentId;
	@Id
	@Column(name="class_id")
	private int classId;
	private String dateOfRegistration;
	private String dateOfFirstClass;
	private String dateOfLastClass;
	private String otherDetail;
	public StudentClassRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentClassRegistration(int studentId, int classId,
			String dateOfRegistration, String dateOfFirstClass,
			String dateOfLastClass, String otherDetail) {
		super();
		this.studentId = studentId;
		this.classId = classId;
		this.dateOfRegistration = dateOfRegistration;
		this.dateOfFirstClass = dateOfFirstClass;
		this.dateOfLastClass = dateOfLastClass;
		this.otherDetail = otherDetail;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(String dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	public String getDateOfFirstClass() {
		return dateOfFirstClass;
	}
	public void setDateOfFirstClass(String dateOfFirstClass) {
		this.dateOfFirstClass = dateOfFirstClass;
	}
	public String getDateOfLastClass() {
		return dateOfLastClass;
	}
	public void setDateOfLastClass(String dateOfLastClass) {
		this.dateOfLastClass = dateOfLastClass;
	}
	public String getOtherDetail() {
		return otherDetail;
	}
	public void setOtherDetail(String otherDetail) {
		this.otherDetail = otherDetail;
	}

	
	
}
