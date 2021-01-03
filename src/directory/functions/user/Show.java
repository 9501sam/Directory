package directory.functions.user;

import java.util.Scanner;

import directory.data.DataFrame;

//import directory.data.sort.DataFrameSort;

public class Show{

	//public static voie sort(){
	//	Scanner keyboard = new Scanner(System.in);
	//	System.out.println("Chose an attribite to sort:");
	//	System.out.println("[n]one");
	//	for(int i = 0;  i < df.getHeader().length; i++){
	//		System.out.println("[" + (i+1) + "]");
	//		df.printAHeader(df.getHeader()[i]);
	//	}
	//	String str[] = new String[2];
	//	str[0] = keyboard.nextLine();
	//	System.out.println("[in]crease");
	//	System.out.println("[de]crease");
	//	str[1] = keyboard.nextLine();
	//	return str;
	//}

	public static void run(DataFrame df){
		Scanner keyboard = new Scanner(System.in);

		System.out.println("================================");
		System.out.println("show [all] data.");
		System.out.println("show [a] column.");
		System.out.println("[q]uit.");
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
