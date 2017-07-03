/**
 * 
 */
package com.student.resgistration.dao;

import java.util.List;

import com.student.resgistration.model.ParentsAndGuardians;


/**
 * @author LamNS3
 *
 */
public interface ParentsAndGuardiansDAO {
	public boolean addParentsAndGuardians(ParentsAndGuardians parentsAndGuardians);
	public boolean updateParentsAndGuardians(ParentsAndGuardians parentsAndGuardians);
	public List<ParentsAndGuardians> listParentsAndGuardians();
	public ParentsAndGuardians getParentsAndGuardiansById(int parentsAndGuardiansId);
	public boolean removeParentsAndGuardians(int parentsAndGuardiansId);

}
