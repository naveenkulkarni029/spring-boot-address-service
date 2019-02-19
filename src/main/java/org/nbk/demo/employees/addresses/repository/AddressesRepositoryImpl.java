package org.nbk.demo.employees.addresses.repository;

import java.util.List;

import org.nbk.demo.employees.addresses.domain.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
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
	public Address getByAddressEmployeeEmail(String employeeEmail) {
		return mongoTemplate.findOne(prepareQuery(employeeEmail), Address.class, "Addresses");
	}

	@Override
	public List<Address> listAddresses() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Query prepareQuery(String employeeEmail) {
		Query query = new Query();
		query.addCriteria(Criteria.where("employeeEmail").is(employeeEmail));
		return query;
	}

}