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
@Table(name="addresses")
public class Addresses {

	@Id
	@Column(name="address_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int addressId;
	private String universityAccommodationYn;
	private String line1NumberBuilding;
	private String line2NumberStreet;
	private String line3Area_locality;
	private String city;
	private String stateProvinceCountry;
	private String country;
	private String otherAddressDetail;
	public Addresses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Addresses(int addressId, String universityAccommodationYn,
			String line1NumberBuilding, String line2NumberStreet,
			String line3Area_locality, String city,
			String stateProvinceCountry, String country,
			String otherAddressDetail) {
		super();
		this.addressId = addressId;
		this.universityAccommodationYn = universityAccommodationYn;
		this.line1NumberBuilding = line1NumberBuilding;
		this.line2NumberStreet = line2NumberStreet;
		this.line3Area_locality = line3Area_locality;
		this.city = city;
		this.stateProvinceCountry = stateProvinceCountry;
		this.country = country;
		this.otherAddressDetail = otherAddressDetail;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getUniversityAccommodationYn() {
		return universityAccommodationYn;
	}
	public void setUniversityAccommodationYn(String universityAccommodationYn) {
		this.universityAccommodationYn = universityAccommodationYn;
	}
	public String getLine1NumberBuilding() {
		return line1NumberBuilding;
	}
	public void setLine1NumberBuilding(String line1NumberBuilding) {
		this.line1NumberBuilding = line1NumberBuilding;
	}
	public String getLine2NumberStreet() {
		return line2NumberStreet;
	}
	public void setLine2NumberStreet(String line2NumberStreet) {
		this.line2NumberStreet = line2NumberStreet;
	}
	public String getLine3Area_locality() {
		return line3Area_locality;
	}
	public void setLine3Area_locality(String line3Area_locality) {
		this.line3Area_locality = line3Area_locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateProvinceCountry() {
		return stateProvinceCountry;
	}
	public void setStateProvinceCountry(String stateProvinceCountry) {
		this.stateProvinceCountry = stateProvinceCountry;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getOtherAddressDetail() {
		return otherAddressDetail;
	}
	public void setOtherAddressDetail(String otherAddressDetail) {
		this.otherAddressDetail = otherAddressDetail;
	}
	
	
	
}
