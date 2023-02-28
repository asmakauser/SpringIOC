package com.springcore;

public class Employee {

	private Address address;

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Employee(Address address) {
		super();
		this.address = address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
