/**
 * 
 */
package com.student.resgistration.dao;

import java.util.List;

import com.student.resgistration.model.Addresses;

/**
 * @author LamNS3
 *
 */
public interface AddressesDAO {
	public boolean addAddress(Addresses address);
	public boolean updateAddress(Addresses address);
	public List<Addresses> listAddresses();
	public Addresses getAddressById(int addressId);
	public boolean removeAddress(int addressId);

}
