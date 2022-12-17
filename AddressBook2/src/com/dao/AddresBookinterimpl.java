package com.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.bean.AddressBook;



public class AddresBookinterimpl implements AddressBookInterface {
   Scanner sc = new Scanner(System.in);
   AddressBook ab=null;
   ArrayList<AddressBook> al=null;
	@Override
	public boolean addData(AddressBook ab) {
		boolean f = false;
		   try {
			 //jdbc code
				Connection con = CP.createC();
				String q = "insert into addressbook(name,email,phonenumber,address) values(?,?,?,?)";
				PreparedStatement ptsmt = con.prepareStatement(q);
				//set the value of parameters
				ptsmt.setString(1,ab.getName());
				ptsmt.setString(2, ab.getEmail());
				ptsmt.setString(3,ab.getPhone());
				ptsmt.setString(4,ab.getAddress());
				
				//execute
				ptsmt.executeUpdate();
				f=true;
		     } 
		   catch (Exception e) 
		   {
			e.printStackTrace();
		   }
		   return f;
		
	}

	@Override
	public ArrayList<AddressBook> viewAllContact() {
		try {
			 //jdbc code
			al=new ArrayList<AddressBook>();
				Connection con = CP.createC();
				String q = "select * from addressbook";
				PreparedStatement pt = con.prepareStatement(q);
				ResultSet set = pt.executeQuery();
				while(set.next())
				{
					ab=new AddressBook();
				    ab.setId(set.getInt(1));
				    ab.setName(set.getString(2));
				    ab.setEmail(set.getString(3));
				    ab.setPhone(set.getString(4));
				    ab.setAddress(set.getString(5));
				    al.add(ab);
				    
				}
				
				return al;
		     } 
		   catch (Exception e) 
		   {
			e.printStackTrace();
		   }
		   return null;
	}

	@Override
	public boolean updateByName(String name, AddressBook ab) {
           
        try {
        	Connection con = CP.createC();
            String q = "update addressbook set name=?, email=?, phonenumber=?, address=? where name=?";
            PreparedStatement ptsmt = con.prepareStatement(q);
            System.out.println("enter name");
            String name1 = sc.nextLine();
            System.out.println("enter email");
            String email1 = sc.nextLine();
            System.out.println("enter phonenumber");
            String phone = sc.nextLine();
            System.out.println("enter address");
            String address1 = sc.nextLine();
            
            
            ptsmt.setString(1, name1);
            ptsmt.setString(2, email1);
            ptsmt.setString(3, phone);
            ptsmt.setString(4, address1);
            ptsmt.setString(5,name);
            
            ptsmt.executeUpdate();
           return true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
		   return false;
		
	}

	@Override
	public boolean updateByPhoneNumber(String Number, AddressBook ab) {
		try {
        	Connection con = CP.createC();
            String q = "update addressbook set name=?, email=?, phonenumber=?, address=? where phonenumber=?";
            PreparedStatement ptsmt = con.prepareStatement(q);
            System.out.println("enter name");
            String name1 = sc.nextLine();
            System.out.println("enter email");
            String email1 = sc.nextLine();
            System.out.println("enter phonenumber");
            String phone = sc.nextLine();
            System.out.println("enter address");
            String address1 = sc.nextLine();
            
            
            ptsmt.setString(1, name1);
            ptsmt.setString(2, email1);
            ptsmt.setString(3, phone);
            ptsmt.setString(4, address1);
            ptsmt.setString(5,Number);
            
            ptsmt.executeUpdate();
           return true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
		return false;
	}

	@Override
	public AddressBook searchByName(String name) {
		try {
			 //jdbc code
				Connection con = CP.createC();
				String q = "select * from addressbook where name='"+name+"'";
				Statement stmt = con.createStatement();
				ResultSet set = stmt.executeQuery(q);
				while(set.next())
				{
				    int id = set.getInt(1);
				    String name1 = set.getString(2);
				    String email = set.getString(3);
				    String phonenumber = set.getString(4);
				    String address = set.getString("address");
				    
				    System.out.println("Id:"+id);
				    System.out.println("Name:"+name1);
				    System.out.println("email:"+email);
				    System.out.println("phone:"+phonenumber);
				    System.out.println("City:"+address);
				}
				
				//f=true;
		     } 
		   catch (Exception e) 
		   {
			e.printStackTrace();
		   }
		
		return null;
	}

	@Override
	public AddressBook searchByPhoneNumber(String phoneNumber) {
		try {
			 //jdbc code
				Connection con = CP.createC();
				String q = "select * from addressbook where phonenumber='"+phoneNumber+"'";
				Statement stmt = con.createStatement();
				ResultSet set = stmt.executeQuery(q);
				while(set.next())
				{
				    int id = set.getInt(1);
				    String name1 = set.getString(2);
				    String email = set.getString(3);
				    String phonenumber = set.getString(4);
				    String address = set.getString("address");
				    
				    System.out.println("Id:"+id);
				    System.out.println("Name:"+name1);
				    System.out.println("email:"+email);
				    System.out.println("phone:"+phonenumber);
				    System.out.println("City:"+address);
				}
				
		     } 
		   catch (Exception e) 
		   {
			e.printStackTrace();
		   }
		
		return null;
	}

	@Override
	public boolean daleteByName(String name) {
		try {
			 //jdbc code
				Connection con = CP.createC();
				String q = "delete from addressbook where name=?";
				PreparedStatement ptsmt = con.prepareStatement(q);
				//set the value of parameters
				
				ptsmt.setString(1,name);
				
				//execute
				ptsmt.executeUpdate();
			    return true;
		     } 
		   catch (Exception e) 
		   {
			e.printStackTrace();
		   }
		return false;
	}

	@Override
	public boolean daleteByPhoneNumber(String phoneNumber) {
		try {
			 //jdbc code
				Connection con = CP.createC();
				String q = "delete from addressbook where phonenumber=?";
				PreparedStatement ptsmt = con.prepareStatement(q);
				//set the value of parameters
				
				ptsmt.setString(1,phoneNumber);
				
				//execute
				ptsmt.executeUpdate();
			    return true;
		     } 
		   catch (Exception e) 
		   {
			e.printStackTrace();
		   }
		return false;
	}

}
