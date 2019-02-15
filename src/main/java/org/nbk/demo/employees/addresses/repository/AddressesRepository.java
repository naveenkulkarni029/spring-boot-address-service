package org.nbk.demo.employees.addresses.repository;

import java.util.List;

import org.nbk.demo.employees.addresses.domain.Address;

public interface AddressesRepository {
	
	public void save(Address address);
	
	public Address getByEmployeeId(String employeeId);
	
	public List<Address> listByEmployeeId(String employeeId);
	
	public Address getByAddressId(String addressId);
	
	public List<Address> listAddresses();

}