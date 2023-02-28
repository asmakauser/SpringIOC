package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	//@Autowired
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

	@Autowired
	public Employee(Address address) {
		super();
		System.out.println("from constructor");
		this.address = address;
	}

	/**
	 * @param address the address to set
	 */

   // @Autowired
	public void setAddress(Address address) {
		System.out.println("Setting Value");
		this.address = address;
	}

}
