package directory.functions.advanced;

import directory.fileIO.Writer;

import java.util.Scanner;

public class ChooseQuestion{
	public static void run(){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("\033[H\033[2J");
		System.out.println("================================");
		System.out.println("Chose authentication question:");
		System.out.println("================================");
		System.out.println("[n]one.");
		System.out.println("[s]ort three integer between 1-100.");
		System.out.println("[c]ompute a simple arithmetic.");
		System.out.print(":");
		String input = keyboard.nextLine();
		input = input.toLowerCase();
		if(input.equals("n")){
			Writer.setAuthen(0);
			System.out.print("\033[H\033[2J");
			System.out.println("================================");
			System.out.print("set to ");
			System.out.println("none.");
			System.out.println("================================");
		}else if(input.equals("s")){
			Writer.setAuthen(1);
			System.out.print("\033[H\033[2J");
			System.out.println("================================");
			System.out.print("set to ");
			System.out.println("sort three integer between 1-100.");
			System.out.println("================================");
		}else if(input.equals("c")){
			Writer.setAuthen(2);
			System.out.print("\033[H\033[2J");
			System.out.println("================================");
			System.out.print("set to ");
			System.out.println("compute a simple arithmetic.");
			System.out.println("================================");
		}else{
			System.out.print("\033[H\033[2J");
			System.out.println("================================");
			System.out.println("There is nothing to do.");
			System.out.println("================================");
		}
	}
}
