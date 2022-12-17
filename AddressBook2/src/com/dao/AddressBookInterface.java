package com.dao;

import java.util.ArrayList;

import com.bean.AddressBook;

public interface AddressBookInterface {
	 public boolean addData(AddressBook ab);
	   public ArrayList<AddressBook> viewAllContact();
	   public boolean updateByName(String name,AddressBook ab);
	   public boolean updateByPhoneNumber(String Number,AddressBook ab);
	   public AddressBook searchByName(String name);
	   public AddressBook searchByPhoneNumber(String phoneNumber);
	   public boolean daleteByName(String name);
	   public boolean daleteByPhoneNumber(String phoneNumber); 
}
