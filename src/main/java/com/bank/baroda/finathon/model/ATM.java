package com.bank.baroda.finathon.model;


public class ATM {

	private Long atmId;
	private Address address;
	private Location location;
	public Long getAtmId() {
		return atmId;
	}
	public void setAtmId(Long atmId) {
		this.atmId = atmId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
}
