package directory.functions.advanced;

import directory.fileIO.Reader;
import directory.fileIO.Writer;

import java.util.Scanner;

public class AddRelationship{
	public static void run(){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("\033[H\033[2J");
		System.out.println("=================");
		System.out.println("add relationship");
		System.out.println("=================");
		System.out.println("enter new relationship");
		System.out.print(":");
		String str = keyboard.nextLine();

		Writer.addRelationship(str);
		System.out.print("\033[H\033[2J");
		System.out.println("=================");
		System.out.println("added");
		System.out.println("=================");
	}
}
