package directory.functions.user;

import java.util.Scanner;

import directory.data.DataFrame;

public class Show{
	public static void run(DataFrame df){
		Scanner keyboard = new Scanner(System.in);

		System.out.println("================================");
		System.out.println("show [all] data.");
		System.out.println("show [an] attribute.");
		System.out.println("[q]uit.");
		System.our.ptint(":");

		String cmd = keyboard.nextLine().toLowerCase();

		if(cmd.equals("all")){
			df.
		}else if(cmd.equals("an")){
			printOne(df);
		}

		//for(int i = 0; i < df.getHeader().length; i++){
		//	System.out.println("[" + (i+1) + "] " + df.getHeader()[i] + ".");
		//}
		//int showAttri = keyboard.nextInt() - 1;

		//System.out.println("sort by an attribute?");
		//System.out.println("[0] none");
		//for(int i = 0; i < df.getHeader().length; i++){
		//	System.out.println("[" + (i+1) + "] " + df.getHeader()[i] + ".");
		//}
		//int sortAttri = keyboard.nextInt() - 1;

		//if(sortAttri >= 0){
		//	System.out.println("sort by " + df.getHeader()[sortAttri] + ", ");
		//}
		//if(showAttri >= 0){
		//	System.out.println("show attribute \"" + df.getHeader()[showAttri]+ "\":");
		//}else{
		//	System.out.println("show all data:");
		//	df.printAllHeader();
		//	df.printAllData();
		//}

		System.out.println("================================");
		System.out.println("");
	}
}
