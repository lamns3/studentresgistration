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
@Table(name="student_address")
public class StudentAddress {
	
	@Id
	@Column(name="student_address_id")
	private int studentAddressId;
	@Id
	@Column(name="student_id")
	private int studentId;
	@Id
	@Column(name="address_id")
	private int addressId;
	private String dateAddressFrom;
	private String dateAddressTo;
	private String monthlyRental;
	private String otherDetail;
	public StudentAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentAddress(int studentAddressId, int studentId, int addressId,
			String dateAddressFrom, String dateAddressTo, String monthlyRental,
			String otherDetail) {
		super();
		this.studentAddressId = studentAddressId;
		this.studentId = studentId;
		this.addressId = addressId;
		this.dateAddressFrom = dateAddressFrom;
		this.dateAddressTo = dateAddressTo;
		this.monthlyRental = monthlyRental;
		this.otherDetail = otherDetail;
	}
	public int getStudentAddressId() {
		return studentAddressId;
	}
	public void setStudentAddressId(int studentAddressId) {
		this.studentAddressId = studentAddressId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getDateAddressFrom() {
		return dateAddressFrom;
	}
	public void setDateAddressFrom(String dateAddressFrom) {
		this.dateAddressFrom = dateAddressFrom;
	}
	public String getDateAddressTo() {
		return dateAddressTo;
	}
	public void setDateAddressTo(String dateAddressTo) {
		this.dateAddressTo = dateAddressTo;
	}
	public String getMonthlyRental() {
		return monthlyRental;
	}
	public void setMonthlyRental(String monthlyRental) {
		this.monthlyRental = monthlyRental;
	}
	public String getOtherDetail() {
		return otherDetail;
	}
	public void setOtherDetail(String otherDetail) {
		this.otherDetail = otherDetail;
	}
	
	

}
