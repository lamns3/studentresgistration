/**
 * 
 */
package com.student.resgistration.dao;

import java.util.List;
import com.student.resgistration.model.RefPaymentMethods;

/**
 * @author LamNS3
 *
 */
public interface RefPaymentMethodsDAO {
	public boolean addRefPaymentMethods(RefPaymentMethods refPaymentMethods);
	public boolean updateRefPaymentMethods(RefPaymentMethods refPaymentMethods);
	public List<RefPaymentMethods> listRefPaymentMethods();
	public RefPaymentMethods getRefPaymentMethodsById(int refPaymentMethodsId);
	public boolean removeRefPaymentMethods(int refPaymentMethodsId);
}
