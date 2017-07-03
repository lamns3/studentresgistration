package com.student.resgistration.controller;

import java.util.List;

import com.student.resgistration.model.ParentsAndGuardians;

public interface ParentsAndGuardiansController {
	public boolean addParentsAndGuardians(ParentsAndGuardians parentsAndGuardians);
	public boolean updateParentsAndGuardians(ParentsAndGuardians parentsAndGuardians);
	public List<ParentsAndGuardians> listParentsAndGuardians();
	public ParentsAndGuardians getParentsAndGuardiansById(int parentsAndGuardiansId);
	public boolean removeParentsAndGuardians(int parentsAndGuardiansId);
}
