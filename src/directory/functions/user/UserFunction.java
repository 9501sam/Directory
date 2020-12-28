package directory.functions.user;

import java.util.Scanner;

import directory.fileIO.Reader;
import directory.data.DataFrame;

public class UserFunction{

	public static void run(){
		DataFrame df = new DataFrame();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\n___User function___");
		System.out.print("");
		String cmd = keyboard.nextLine();
		System.out.println("exit admin function.");
	}

}
