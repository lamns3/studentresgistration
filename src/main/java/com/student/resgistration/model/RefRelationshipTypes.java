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
@Table(name="ref_relationship_types")
public class RefRelationshipTypes {
	
	@Id
	@Column(name="relationship_type_code")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int relationshipTypeCode;
	private String relationshipTypeDesctiption;
	public RefRelationshipTypes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RefRelationshipTypes(int relationshipTypeCode,
			String relationshipTypeDesctiption) {
		super();
		this.relationshipTypeCode = relationshipTypeCode;
		this.relationshipTypeDesctiption = relationshipTypeDesctiption;
	}
	public int getRelationshipTypeCode() {
		return relationshipTypeCode;
	}
	public void setRelationshipTypeCode(int relationshipTypeCode) {
		this.relationshipTypeCode = relationshipTypeCode;
	}
	public String getRelationshipTypeDesctiption() {
		return relationshipTypeDesctiption;
	}
	public void setRelationshipTypeDesctiption(String relationshipTypeDesctiption) {
		this.relationshipTypeDesctiption = relationshipTypeDesctiption;
	}
	
	

}
