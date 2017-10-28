package com.bank.baroda.finathon.model;

import java.util.List;

public class Location {
	private Long locationId;
	private Address address;
	
	List<BankBranch> bankBranches;
	List<ATM> atmList;
	List<Person> persons;
	public Long getLocationId() {
		return locationId;
	}
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<BankBranch> getBankBranches() {
		return bankBranches;
	}
	public void setBankBranches(List<BankBranch> bankBranches) {
		this.bankBranches = bankBranches;
	}
	public List<ATM> getAtmList() {
		return atmList;
	}
	public void setAtmList(List<ATM> atmList) {
		this.atmList = atmList;
	}
	public List<Person> getPersons() {
		return persons;
	}
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	

}
