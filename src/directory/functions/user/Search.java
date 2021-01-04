package directory.functions.user;

import java.util.Scanner;
import java.util.ArrayList;

import directory.data.Person;
import directory.fileIO.Reader;

public class Search{
	public static void run(){

		ArrayList<Person> allPeople = Reader.readCsvFile();

		Scanner keyboard = new Scanner(System.in);

		System.out.println("================================");

		System.out.println("Search by:[name/birthDay/phoneNumber/EMail]");
		String key = keyboard.nextLine();

		System.out.print("Search: ");
		String str = keyboard.nextLine();

		for(int i = 0; i < allPeople.size(); i++){
			if(allPeople.get(i).getValueOf(key).equals(str)){
				System.out.print("[" + i + "]");
				allPeople.get(i).printPerson();
			}
		}

		System.out.println("");
		System.out.println("================================");
		System.out.println("");
	}
}
