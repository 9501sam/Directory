package directory.functions.user;

import java.util.Scanner;

import directory.data.DataFrame;

//import directory.data.sort.DataFrameSort;

public class Show{

	public static void run(){
		DataFrame df = new DataFrame();

		Scanner keyboard = new Scanner(System.in);

		System.out.println("================================");
		System.out.println("show [all] data.");
		System.out.println("show [a] column.");
		System.out.print(":");

		String cmd = keyboard.nextLine().toLowerCase();

		if(cmd.equals("all")){
			df.printAllHeader();
			df.printAllPerson();
			//df = DataFrameSort.sort(df);
		}else if(cmd.equals("a")){
			df.printAllHeaderInCol();
			String key = keyboard.nextLine();
			df.printCol(key);
		}

		System.out.println("================================");
		System.out.println("");
	}
}
