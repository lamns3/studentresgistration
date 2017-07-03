package com.student.resgistration.service;

import java.util.List;

import com.student.resgistration.model.RefRelationshipTypes;

public interface RefRelationshipTypesService {
	public boolean addRefRelationshipTypes(RefRelationshipTypes refRelationshipTypes);
	public boolean updateRefRelationshipTypes(RefRelationshipTypes refRelationshipTypes);
	public List<RefRelationshipTypes> listRefRelationshipTypes();
	public RefRelationshipTypes getRefRelationshipTypesById(int refRelationshipTypesId);
	public boolean removeRefRelationshipTypes(int refRelationshipTypesId);
}
