package com.addressbook;
import java.util.Scanner;
public class AddressBook {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your first name:: ");
		String name= sc.nextLine();
		System.out.print("Enter your Last name:: ");
		String lastName= sc.nextLine();
		System.out.print("Enter your Address:: ");
		String address= sc.nextLine();
		System.out.print("Enter your City:: ");
		String city= sc.nextLine();
		System.out.print("Enter your State:: ");
		String state= sc.nextLine();
		System.out.print("Enter your Region:: ");
		String region= sc.nextLine();
		System.out.print("Enter your Zip code:: ");
		String zip=sc.nextLine();
		System.out.print("Enter your Phone Number:: ");
		String num= sc.nextLine();
		System.out.print("Enter your email:: ");
		String email= sc.nextLine();
		
		
		String[] stringArray  = new String[1];
		stringArray[0] = name;
		
		System.out.print(stringArray[0]);
		

	}

}
