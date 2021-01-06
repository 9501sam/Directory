package directory.functions.basic;

import java.util.Scanner;
import java.util.ArrayList;

import directory.data.Person;
import directory.fileIO.Reader;
import directory.functions.basic.*;

public class Search{
	public static void run(){

		ArrayList<Person> allPeople = Reader.readCsvFile();

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Search by:[name/birthDay/phoneNumber/EMail/relationship]");
		System.out.print(":");
		String key = keyboard.nextLine();

		System.out.print("Search: ");
		String str = keyboard.nextLine();

		System.out.print("\033[H\033[2J");
		System.out.println("========================================================");
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < allPeople.size(); i++){
			if(allPeople.get(i).getValueOf(key).equals(str)){
				System.out.print("[" + i + "]");
				allPeople.get(i).printPerson();
				System.out.println();
				result.add(i);
			}
		}
		System.out.println("========================================================");

		if(result.size() == 0){
			System.out.print("\033[H\033[2J");
			System.out.println("=============");
			System.out.println("no match data");
			System.out.println("=============");
			return;
		}

		System.out.println("[1] edit data.");
		System.out.println("[2] delete a data.");
		System.out.println("[3] delete all result data.");
		System.out.println("[q]uit");
		System.out.print(":");
		String in = keyboard.nextLine();
		if(in.equalsIgnoreCase("1")){
			Edit.run(result);
		}else if(in.equalsIgnoreCase("2")){
			Delete.deleteAData(result);
		}else if(in.equalsIgnoreCase("3")){
			Delete.deleteAllData(result);
		}
		System.out.print("\033[H\033[2J");
	}
}
