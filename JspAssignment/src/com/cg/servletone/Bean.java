package com.cg.servletone;

public class Bean {
	
	private String fname;
	
	private String lname;
	
	private String address;
	
	private String password;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return " [fname=" + fname + ", lname=" + lname + ", address="
				+ address + ", password=" + password + "]";
	}
	

}