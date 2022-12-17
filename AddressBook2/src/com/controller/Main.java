package com.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.bean.AddressBook;
import com.dao.AddresBookinterimpl;

public class Main {
         static AddresBookinterimpl abbii = new AddresBookinterimpl();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		    System.out.println("press 1 for Add Contact Number");
		    System.out.println("press 2 for view All Contact Number");
		    System.out.println("press 3 Update By Name");
		    System.out.println("press 4 Update By phone number");
		    System.out.println("press 5 Search By name");
		    System.out.println("press 6 Search By phonenumber");
		    System.out.println("press 7 Delete By Name");
		    System.out.println("press 8 Delete by PhoneNumber");
		    System.out.println("press 9 Exit App");
		    
		    int ch = sc.nextInt();
		    
		    switch (ch) {
			case 1:
				//add
				System.out.println("enter name");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("enter email");
				String email = sc.nextLine();
				System.out.println("enter phone number");
				String phone = sc.nextLine();
				System.out.println("enter address");
				String address = sc.nextLine();
				AddressBook ab = new AddressBook(name, email, phone, address);
				
				if (abbii.addData(ab)) 
				{
					System.out.println("data added sucessfully");
				} else {
					System.out.println("some error");
				}
				break;
				
			case 2:
				//view All Contact Number
				ArrayList<AddressBook> al = abbii.viewAllContact();
				for (AddressBook addressBook : al) {
					System.out.println(addressBook);
				}
				break;
				
			case 3:
				//Update By Name
				System.out.println("enter name");
				sc.nextLine();
				String name1 = sc.nextLine();
				AddressBook ab1 = new AddressBook();
				
				if (abbii.updateByName(name1, ab1)) {
					System.out.println("dta updated");
				} else {
					System.out.println("some error");
				}
				break;
				
			case 4:
				//Update By phone number
				System.out.println("enter number");
				sc.nextLine();
				String phone1 = sc.nextLine();
				AddressBook ab2 = new AddressBook();
				abbii.updateByPhoneNumber(phone1, ab2);
				break;		
           
			case 5:
				//Search By name
				System.out.println("enter name");
				sc.nextLine();
				String name11 = sc.nextLine();
				abbii.searchByName(name11);
				break;
			
			case 6:
				//Search By phonenumber
				System.out.println("enter number");
				sc.nextLine();
				String phonenuber = sc.nextLine();
				abbii.searchByPhoneNumber(phonenuber);
				break;
			
			case 7:
				//Delete By Name
				System.out.println("enter name");
				sc.nextLine();
				String name12 = sc.nextLine();
				abbii.daleteByName(name12);
				break;
				
			case 8:
				//Delete by PhoneNumber
				System.out.println("enter number");
				sc.nextLine();
				String number = sc.nextLine();
				abbii.daleteByPhoneNumber(number);
				break;
				
			case 9:
				//exit
				System.exit(0);
				break;	
				
			default:
				System.out.println("wrong choice");
				break;
			}
		}

	}

}
