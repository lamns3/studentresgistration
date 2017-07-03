package com.student.resgistration.service;

import java.util.List;

import com.student.resgistration.model.RefPaymentMethods;

public interface RefPaymentMethodsService {
	public boolean addRefPaymentMethods(RefPaymentMethods refPaymentMethods);
	public boolean updateRefPaymentMethods(RefPaymentMethods refPaymentMethods);
	public List<RefPaymentMethods> listRefPaymentMethods();
	public RefPaymentMethods getRefPaymentMethodsById(int refPaymentMethodsId);
	public boolean removeRefPaymentMethods(int refPaymentMethodsId);
}
