package org.nbk.demo.employees.addresses.service;

import java.util.List;

import org.nbk.demo.employees.addresses.domain.Address;

public interface AddressesService {

	public void save(Address address);
	
	public Address getByEmployeeId(String employeeId);
	
	public List<Address> listByEmployeeId(String employeeId);
	
	public Address getByAddressEmployeeEmail(String employeeEmail);
	
	public List<Address> listAddresses(); 
}