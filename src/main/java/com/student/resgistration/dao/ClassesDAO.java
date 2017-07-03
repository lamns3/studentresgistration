/**
 * 
 */
package com.student.resgistration.dao;

import java.util.List;

import com.student.resgistration.model.Classes;


/**
 * @author LamNS3
 *
 */
public interface ClassesDAO {
	public boolean addClasses(Classes classes);
	public boolean updateClasses(Classes classes);
	public List<Classes> listClasses();
	public Classes getClassesById(int classesId);
	public boolean removeClasses(int classesId);
}
