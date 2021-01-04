package directory.functions.user;

import java.util.Scanner;
import directory.functions.user.Search;
import java.util.ArrayList;
import directory.data.Person;
import directory.fileIO.*;

public class Delete{
	public static void run(){
		ArrayList<Person> allPeople = Reader.readCsvFile();
		Scanner keyboard = new Scanner(System.in);

		Search.run();

		System.out.println("chose an data to delete:");
		int n = Integer.valueOf(keyboard.nextLine());
		allPeople.remove(n);
		Writer.saveCsvFile(allPeople);

	}
}
