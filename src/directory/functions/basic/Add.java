package directory.functions.basic;

import directory.data.Person;
import directory.fileIO.Reader;
import directory.fileIO.Writer;

import java.util.Scanner;
import java.util.ArrayList;

public class Add{
	public static void run(){
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Person> allPeople = Reader.readCsvFile();
		Person temp = new Person();
		// input new data
		System.out.print("enter name:");
		String name = keyboard.nextLine();
		System.out.print("enter birthDay:");
		String birthDay = keyboard.nextLine();
		System.out.print("enter phoneNumber:");
		String phoneNumber = keyboard.nextLine();
		System.out.print("enter EMail:");
		String EMail = keyboard.nextLine();

		if(!temp.setName(name) ||
				!temp.setBirthDay(birthDay) || 
				!temp.setPhoneNumber(phoneNumber) ||
				!temp.setEMail(EMail) ){
			System.out.print("\033[H\033[2J");
			System.out.println("===========");
			System.out.println("failed");
			System.out.println("===========");
			return;
		}
		temp.setRelationship();
		allPeople.add(temp);
		Writer.saveCsvFile(allPeople);
		System.out.println("\033[H\033[2J");
		System.out.println("===========");
		System.out.println("added a people");
		System.out.println("===========");

	}
}

