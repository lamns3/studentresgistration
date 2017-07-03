package com.student.resgistration.service;

import java.util.List;

import com.student.resgistration.model.Classes;

public interface ClassesService {
	public boolean addClasses(Classes classes);
	public boolean updateClasses(Classes classes);
	public List<Classes> listClasses();
	public Classes getClassesById(int classesId);
	public boolean removeClasses(int classesId);
}
