package com.student.resgistration.controller;

import java.util.List;

import com.student.resgistration.model.StudentRelationships;

public interface StudentRelationshipsController {
	public boolean addStudentRelationships(StudentRelationships studentRelationships);
	public boolean updateStudentRelationships(StudentRelationships studentRelationships);
	public List<StudentRelationships> listStudentRelationships();
	public StudentRelationships getStudentRelationshipsById(int studentRelationshipsId);
	public boolean removeStudentRelationships(int studentRelationshipsId);
}
