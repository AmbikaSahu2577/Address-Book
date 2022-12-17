package com.bean;

public class AddressBook {
     private int id;
     private String name;
     private String email;
     private String phone;
     private String address;
     
	@Override
	public String toString() {
		return "AddressBook [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address="
				+ address + "]";
	}
	public AddressBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddressBook(String name, String email, String phone, String address) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	public AddressBook(int id, String name, String email, String phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
     
     
}
