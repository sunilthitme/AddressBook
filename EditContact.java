package com.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EditContact {

	public static void main(String[] args) {
		AddContact a = new AddContact();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome into the Program of Address Book System !!");
		AddContact add = new AddContact();
		add.addContact();
		System.out.println("If You want to update contact then press Y");
		String op = sc.nextLine();
		if (op.equals("Y") || op.equals("y")) {
			add.editContact();

		} else {
			System.out.println("Enter valid Keyword");
		}
	}
}