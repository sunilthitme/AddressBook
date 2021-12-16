package com.addressbook;

import java.util.Scanner;

public class StoreData {

	public static void main(String[] args) {
int condition=1;
       String[] stringArray  = new String[9];
		for(int i=0; i<condition;i++) {
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
			
			System.out.println("If you want to add new contact then press 1");
			System.out.print("If you did not want to add new contact then press 2:: ");
			int choise=sc.nextInt();
			System.out.println(choise);
			if(choise==1) {
				condition+=1;
			
		stringArray[0] = name;
		stringArray[1] = lastName;
		stringArray[2] = address;
		stringArray[3] = city;
		stringArray[4] =state;
		stringArray[5] = region;
		stringArray[6] = zip;
		stringArray[7] = num;
		stringArray[8] = email;
		for(i=0;i<9;i++) {
		System.out.print(stringArray[i]);
		}
			}
		else {
			System.out.println("ok thank you");
		}
		}
	}
	}

