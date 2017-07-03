/**
 * 
 */
package com.student.resgistration.dao;

import java.util.List;
import com.student.resgistration.model.RefRelationshipTypes;

/**
 * @author LamNS3
 *
 */
public interface RefRelationshipTypesDAO {
	public boolean addRefRelationshipTypes(RefRelationshipTypes refRelationshipTypes);
	public boolean updateRefRelationshipTypes(RefRelationshipTypes refRelationshipTypes);
	public List<RefRelationshipTypes> listRefRelationshipTypes();
	public RefRelationshipTypes getRefRelationshipTypesById(int refRelationshipTypesId);
	public boolean removeRefRelationshipTypes(int refRelationshipTypesId);
}
