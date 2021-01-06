package directory.functions.basic;

import java.util.Scanner;
import java.util.ArrayList;
import directory.data.Person;
import directory.fileIO.*;

public class Edit{
	public static void run(ArrayList<Integer> result){
		ArrayList<Person> allPeople = Reader.readCsvFile();
		Scanner keyboard = new Scanner(System.in);

		System.out.println("chose an data to edit");
		System.out.println(":");
		int n = Integer.valueOf(keyboard.nextLine()); //user chose an data

		if(result.contains(n)){ //if the data is in search result
			String data[] = keyboard.nextLine().split(",");

			Person temp = new Person();

			// input new data
			System.out.println("enter new name:");
			String name = keyboard.nextLine();
			System.out.println("enter new birthDay:");
			String birthDay = keyboard.nextLine();
			System.out.println("enter new phoneNumber:");
			String phoneNumber = keyboard.nextLine();
			System.out.println("enter new EMail:");
			String EMail = keyboard.nextLine();

			if(!temp.setName(name) ||
					!temp.setBirthDay(birthDay) || 
					!temp.setPhoneNumber(phoneNumber) ||
					!temp.setEMail(EMail) ){
				System.out.println("\033[H\033[2J");
				System.out.println("===========");
				System.out.println("edit failed");
				System.out.println("===========");
			}

			temp.setRelationship();

			Writer.saveCsvFile(allPeople);
			System.out.println("\033[H\033[2J");
			System.out.println("==============");
			System.out.println("edit successed");
			System.out.println("==============");
			return;
		}

		System.out.println("\033[H\033[2J");
		System.out.println("===========");
		System.out.println("edit failed");
		System.out.println("===========");

		return;
	}
}
