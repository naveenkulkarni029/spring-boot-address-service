package org.nbk.demo.employees.addresses.service;

import java.util.List;

import org.nbk.demo.employees.addresses.domain.Address;
import org.nbk.demo.employees.addresses.repository.AddressesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressesServiceImpl implements AddressesService {

	@Autowired
	private AddressesRepository addressesRepository;

	@Override
	public void save(Address address) {
		addressesRepository.save(address);

	}

	@Override
	public Address getByEmployeeId(String employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Address> listByEmployeeId(String employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getByAddressId(String addressId) {
		return addressesRepository.getByAddressId(addressId);
	}

	@Override
	public List<Address> listAddresses() {
		// TODO Auto-generated method stub
		return null;
	}

}