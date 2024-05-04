package com.Data.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	
	@Id
	private int RollNo;
	private String Firstname;
	private String Lastname;
	private String Address;
	private long MobileNo;
	private double Marks;
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}
	public double getMarks() {
		return Marks;
	}
	public void setMarks(double marks) {
		Marks = marks;
	}
	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", Address="
				+ Address + ", MobileNo=" + MobileNo + ", Marks=" + Marks + "]";
	}
	
	
	
}
