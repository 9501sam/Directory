package directory.functions.user;

import java.util.Scanner;
import directory.functions.user.Search;
import java.util.ArrayList;
import directory.data.Person;
import directory.fileIO.*;

public class Delete{
	public static void deleteAData(ArrayList<Integer> result){

		ArrayList<Person> allPeople = Reader.readCsvFile();
		Scanner keyboard = new Scanner(System.in);

		System.out.println("chose an result to delete");
		System.out.print(":");
		int n = Integer.valueOf(keyboard.nextLine());

		if(result.contains(n)){
			allPeople.remove(n);
			Writer.saveCsvFile(allPeople);
			System.out.print("\033[H\033[2J");
			System.out.print("==============");
			System.out.print("deleted a data");
			System.out.print("==============");
		}else{
			System.out.print("\033[H\033[2J");
			System.out.print("==================");
			System.out.print("delete data failed");
			System.out.print("==================");
		}
	}

	public static void deleteAllData(ArrayList<Integer> result){

		ArrayList<Person> allPeople = Reader.readCsvFile();
		Scanner keyboard = new Scanner(System.in);

		for(int i = 0; i < result.size(); i++)
			allPeople.remove(result.get(i));
		Writer.saveCsvFile(allPeople);

		System.out.print("\033[H\033[2J");
		System.out.println("===================");
		System.out.println("deleted all result");
		System.out.println("===================");
	}
}
