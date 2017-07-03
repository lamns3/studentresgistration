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
@Table(name="parents_and_guardians")
public class ParentsAndGuardians {
	@Id
	@Column(name="person_id")
	private int personId;
	
	@Id
	@Column(name="address_id")
	private int addressId;
	private String gender;
	private String firstName;
	private String middleName;
	private String lastName;
	private String mobileNumber;
	private String emailAddess;
	private String otherDetail;
	public ParentsAndGuardians() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ParentsAndGuardians(int personId, int addressId, String gender,
			String firstName, String middleName, String lastName,
			String mobileNumber, String emailAddess, String otherDetail) {
		super();
		this.personId = personId;
		this.addressId = addressId;
		this.gender = gender;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.emailAddess = emailAddess;
		this.otherDetail = otherDetail;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
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
	public String getOtherDetail() {
		return otherDetail;
	}
	public void setOtherDetail(String otherDetail) {
		this.otherDetail = otherDetail;
	}
	
	
	

}
