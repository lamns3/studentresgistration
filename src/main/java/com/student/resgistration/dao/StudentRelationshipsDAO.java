package com.student.resgistration.dao;

import java.util.List;

import com.student.resgistration.model.StudentRelationships;

public interface StudentRelationshipsDAO {
	public boolean addStudentRelationships(StudentRelationships studentRelationships);
	public boolean updateStudentRelationships(StudentRelationships studentRelationships);
	public List<StudentRelationships> listStudentRelationships();
	public StudentRelationships getStudentRelationshipsById(int studentRelationshipsId);
	public boolean removeStudentRelationships(int studentRelationshipsId);
}
