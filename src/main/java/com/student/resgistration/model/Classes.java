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
@Table(name="classes")
public class Classes {

	@Id
	@Column(name="class_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int classId;
	private String className;
	private String classDescription;
	private String otherDetail;
	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classes(int classId, String className, String classDescription,
			String otherDetail) {
		super();
		this.classId = classId;
		this.className = className;
		this.classDescription = classDescription;
		this.otherDetail = otherDetail;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassDescription() {
		return classDescription;
	}
	public void setClassDescription(String classDescription) {
		this.classDescription = classDescription;
	}
	public String getOtherDetail() {
		return otherDetail;
	}
	public void setOtherDetail(String otherDetail) {
		this.otherDetail = otherDetail;
	}
	
	
	
}
