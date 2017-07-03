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
@Table(name="ref_payment_methods")
public class RefPaymentMethods {
	@Id
	@Column(name="payment_method_code")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int paymentMethodCode;
	private String paymentMethodDescription;
	public RefPaymentMethods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RefPaymentMethods(int paymentMethodCode,
			String paymentMethodDescription) {
		super();
		this.paymentMethodCode = paymentMethodCode;
		this.paymentMethodDescription = paymentMethodDescription;
	}
	public int getPaymentMethodCode() {
		return paymentMethodCode;
	}
	public void setPaymentMethodCode(int paymentMethodCode) {
		this.paymentMethodCode = paymentMethodCode;
	}
	public String getPaymentMethodDescription() {
		return paymentMethodDescription;
	}
	public void setPaymentMethodDescription(String paymentMethodDescription) {
		this.paymentMethodDescription = paymentMethodDescription;
	}
	
	

}
