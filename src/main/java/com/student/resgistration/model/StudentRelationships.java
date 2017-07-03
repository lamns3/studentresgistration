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
@Table(name="student_relationships")
public class StudentRelationships {
	@Id
	@Column(name="student_id")
	private int studentId;
	
	@Id
	@Column(name="person_id")
	private int personId;
	private int relationshipTypeCode;
	
	
	public StudentRelationships() {
		super();
		// TODO Auto-generated constructor stub
	}


	public StudentRelationships(int studentId, int personId,
			int relationshipTypeCode) {
		super();
		this.studentId = studentId;
		this.personId = personId;
		this.relationshipTypeCode = relationshipTypeCode;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public int getPersonId() {
		return personId;
	}


	public void setPersonId(int personId) {
		this.personId = personId;
	}


	public int getRelationshipTypeCode() {
		return relationshipTypeCode;
	}


	public void setRelationshipTypeCode(int relationshipTypeCode) {
		this.relationshipTypeCode = relationshipTypeCode;
	}
	
	
	

}
