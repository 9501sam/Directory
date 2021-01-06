package directory.functions.user;

import java.util.Scanner;
import directory.functions.user.Search;
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
			Writer.saveCsvFile(allPeople);
		}else{
			System.out.println("===========");
			System.out.println("edit failed");
			System.out.println("===========");
		}
	}
}
