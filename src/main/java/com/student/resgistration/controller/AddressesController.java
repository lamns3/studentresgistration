package com.student.resgistration.controller;

import java.util.List;

import com.student.resgistration.model.Addresses;

public interface AddressesController {
	public boolean addAddress(Addresses address);
	public boolean updateAddress(Addresses address);
	public List<Addresses> listAddresses();
	public Addresses getAddressById(int addressId);
	public boolean removeAddress(int addressId);
}
