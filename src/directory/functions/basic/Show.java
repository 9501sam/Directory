package directory.functions.basic;

import java.util.Scanner;
import java.util.ArrayList;

import directory.data.Person;
import directory.fileIO.Reader;
import directory.data.Sort;

public class Show{

	public static void run(){

		ArrayList<Person> allPeoele = Reader.readCsvFile();

		Scanner keyboard = new Scanner(System.in);

		System.out.println("__________show option__________");
		System.out.println("show [all] data.");
		System.out.println("_______________________________");
		System.out.print(":");
		String cmd = keyboard.nextLine().toLowerCase();

		if(cmd.equals("all")){
			//print
			System.out.print("\033[H\033[2J");
			System.out.println("============================================");
			System.out.println("name,birthDay,phoneNumber,Email,relationship");
			for(int i = 0; i < allPeoele.size(); i++){
				allPeoele.get(i).printPerson();
				System.out.println("");
			}
			System.out.println("============================================");
		}
	}
}
