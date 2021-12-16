package com.addresBook;

import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {
		int condition = 1;

		for (int i = 0; i < condition; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your first name:: ");
			String name = sc.nextLine();
			System.out.print("Enter your Last name:: ");
			String lastName = sc.nextLine();
			System.out.print("Enter your Address:: ");
			String address = sc.nextLine();
			System.out.print("Enter your City:: ");
			String city = sc.nextLine();
			System.out.print("Enter your State:: ");
			String state = sc.nextLine();
			System.out.print("Enter your Region:: ");
			String region = sc.nextLine();
			System.out.print("Enter your Zip code:: ");
			String zip = sc.nextLine();
			System.out.print("Enter your Phone Number:: ");
			String num = sc.nextLine();
			System.out.print("Enter your email:: ");
			String email = sc.nextLine();

			System.out.println("If you want to add new contact then press 1");
			System.out.print("If you did not want to add new contact then press 2:: ");
			int choise = sc.nextInt();
			System.out.println(choise);
			if (choise == 1) {
				condition += 1;
			} else {
				System.out.println("ok thank you");
			}
		}
	}
}
