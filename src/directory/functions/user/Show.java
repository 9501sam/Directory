package directory.functions.user;

import java.util.Scanner;
import java.util.ArrayList;

import directory.data.Person;
import directory.fileIO.Reader;
import directory.data.Sort;

public class Show{

	public static void run(){

		ArrayList<Person> allPeoele = Reader.readCsvFile();

		Scanner keyboard = new Scanner(System.in);

		System.out.println("================================");

		System.out.println("show [all] data.");
		System.out.print(":");
		String cmd = keyboard.nextLine().toLowerCase();

		if(cmd.equals("all")){
			//System.out.println("sort by [none/name/birthDay/phoneNumber/EMail]");
			//String cmd2 = keyboard.nextLine().toLowerCase();
			//if(!cmd2.equals("none")){
			//	System.out.println("[in]crease or [de]crease");
			//	String cmd3 = keyboard.nextLine().toLowerCase();
			//	Sort.sortBy(allPeoele, cmd2, cmd3);
			//}
			
			//print
			System.out.println("name,birthDay,phoneNumber,Email,relationship");
			for(int i = 0; i < allPeoele.size(); i++){
				allPeoele.get(i).printPerson();
				System.out.println("");
			}
		}

		System.out.println("================================");
		System.out.println("");
	}
}
