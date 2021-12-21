package com.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddContact {
	public static VariableDeclare addContact() {
		Scanner sc = new Scanner(System.in);
		VariableDeclare add = new VariableDeclare();
		System.out.print("Enter your first name:: ");
		add.name = sc.nextLine();
		System.out.print("Enter your Last name:: ");
		add.lastName = sc.nextLine();
		System.out.print("Enter your Address:: ");
		add.address = sc.nextLine();
		System.out.print("Enter your City:: ");
		add.city = sc.nextLine();
		System.out.print("Enter your State:: ");
		add.state = sc.nextLine();
		System.out.print("Enter your Region:: ");
		add.region = sc.nextLine();
		System.out.print("Enter your Zip code:: ");
		add.zip = sc.nextLine();
		System.out.print("Enter your Phone Number:: ");
		add.mobNum = sc.nextLine();
		System.out.print("Enter your email:: ");
		add.email = sc.nextLine();
		return add;
	}

	public void editContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name of person");
		String editName = sc.nextLine();
		VariableDeclare add = addContact();
		if (editName.equalsIgnoreCase(add.name)) {
			addContact();
		} else
			System.out.println("The Entered First Name is Not Match");
	}
}
