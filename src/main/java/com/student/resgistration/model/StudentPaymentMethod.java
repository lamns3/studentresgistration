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
@Table(name="student_payment_methods")
public class StudentPaymentMethod {
	@Id
	@Column(name="student_payment_method_id")
	private String studentPlaymentMethodId;
	private String paymentMethodCode;
	@Id
	@Column(name="student_id")
	private int studentId;
	private String bankDetail;
	private String cardDetail;
	private String otherDetail;
	public StudentPaymentMethod() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentPaymentMethod(String studentPlaymentMethodId,
			String paymentMethodCode, int studentId, String bankDetail,
			String cardDetail, String otherDetail) {
		super();
		this.studentPlaymentMethodId = studentPlaymentMethodId;
		this.paymentMethodCode = paymentMethodCode;
		this.studentId = studentId;
		this.bankDetail = bankDetail;
		this.cardDetail = cardDetail;
		this.otherDetail = otherDetail;
	}
	public String getStudentPlaymentMethodId() {
		return studentPlaymentMethodId;
	}
	public void setStudentPlaymentMethodId(String studentPlaymentMethodId) {
		this.studentPlaymentMethodId = studentPlaymentMethodId;
	}
	public String getPaymentMethodCode() {
		return paymentMethodCode;
	}
	public void setPaymentMethodCode(String paymentMethodCode) {
		this.paymentMethodCode = paymentMethodCode;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getBankDetail() {
		return bankDetail;
	}
	public void setBankDetail(String bankDetail) {
		this.bankDetail = bankDetail;
	}
	public String getCardDetail() {
		return cardDetail;
	}
	public void setCardDetail(String cardDetail) {
		this.cardDetail = cardDetail;
	}
	public String getOtherDetail() {
		return otherDetail;
	}
	public void setOtherDetail(String otherDetail) {
		this.otherDetail = otherDetail;
	}
	
	

}
