package org.nbk.demo.employees.addresses.repository;

import java.util.List;

import org.nbk.demo.employees.addresses.domain.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AddressesRepositoryImpl implements AddressesRepository {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void save(Address address) {
		mongoTemplate.save(address, "Addresses");

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
		return mongoTemplate.findById(addressId, Address.class, "Addresses");
	}

	@Override
	public List<Address> listAddresses() {
		// TODO Auto-generated method stub
		return null;
	}

}