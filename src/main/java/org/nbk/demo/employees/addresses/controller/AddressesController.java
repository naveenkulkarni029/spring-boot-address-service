package org.nbk.demo.employees.addresses.controller;

import org.nbk.demo.employees.addresses.domain.Address;
import org.nbk.demo.employees.addresses.domain.response.ResponseAddress;
import org.nbk.demo.employees.addresses.service.AddressesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressesController {

	@Autowired
	private AddressesService addressesService;
	
	
	@PostMapping(value="/employees/addresses/save", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseAddress> save(@RequestBody Address address) {
		addressesService.save(address);
		return ResponseEntity.ok(new ResponseAddress());
		
	}
	
	@GetMapping(value="/employees/address/get/{employeeEmail}", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Address> getAddressByAddressId(@PathVariable String employeeEmail) {
		//return ResponseEntity.ok(addressesService.getByAddressEmployeeEmail(employeeEmail));
		
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping(value="/employees/address/demo", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseAddress> demo() {
		return ResponseEntity.ok(new ResponseAddress());
	}
}