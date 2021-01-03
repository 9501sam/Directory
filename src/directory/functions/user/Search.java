package directory.functions.user;

import java.util.Scanner;
import directory.data.DataFrame;

public class Search{
	public static void run(){
		DataFrame df = new DataFrame();

		Scanner keyboard = new Scanner(System.in);

		System.out.println("================================");
		System.out.println("Search by:");
		df.printAllHeaderInCol();
		String key = keyboard.nextLine();

		System.out.print("Search: ");

		String str = keyboard.nextLine();

		for(int i = 0; i < df.getAllPerson().size(); i++){
			if(df.getAllPerson().get(i).getValueOf(key).equals(str)){
				df.printAPerson(i);
			}
		}


		System.out.println("================================");
		System.out.println("");
	}
}
