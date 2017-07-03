/**
 * 
 */
package com.student.resgistration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author LamNS3
 *
 */
@Entity
@Table(name="student")
public class Student {
	@Id
	@Column(name="student_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentId;
	private String gender;
	private String firstName;
	private String middleName;
	private String lastName;
	private String mobileNumber;
	private String emailAddess; 
	private String dateFirst_rental;
	private String datLeftUniversity;
	private String otherStudentDetails;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String gender, String firstName,
			String middleName, String lastName, String mobileNumber,
			String emailAddess, String dateFirst_rental,
			String datLeftUniversity, String otherStudentDetails) {
		super();
		this.studentId = studentId;
		this.gender = gender;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.emailAddess = emailAddess;
		this.dateFirst_rental = dateFirst_rental;
		this.datLeftUniversity = datLeftUniversity;
		this.otherStudentDetails = otherStudentDetails;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailAddess() {
		return emailAddess;
	}

	public void setEmailAddess(String emailAddess) {
		this.emailAddess = emailAddess;
	}

	public String getDateFirst_rental() {
		return dateFirst_rental;
	}

	public void setDateFirst_rental(String dateFirst_rental) {
		this.dateFirst_rental = dateFirst_rental;
	}

	public String getDatLeftUniversity() {
		return datLeftUniversity;
	}

	public void setDatLeftUniversity(String datLeftUniversity) {
		this.datLeftUniversity = datLeftUniversity;
	}

	public String getOtherStudentDetails() {
		return otherStudentDetails;
	}

	public void setOtherStudentDetails(String otherStudentDetails) {
		this.otherStudentDetails = otherStudentDetails;
	}
	

}
