package directory.functions;

import java.util.Scanner;

//import directory.data.DataFrame;
import directory.fileIO.Writer;

public class AdminFunction{
	public static void run(){
		//input cmd
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\033[H\033[2J");
		System.out.println("__________Admin function__________");
		System.out.println("[lo]gin authentication setting");
		System.out.println("[q]uit to menu");
		System.out.println("__________________________________");
		System.out.print(":");
		String cmd = keyboard.nextLine();
		cmd = cmd.toLowerCase();

		while(!cmd.equals("q")){
			if(cmd.equals("lo")){
				System.out.println("================================");
				System.out.println("Chose authentication question:");
				System.out.println("[n]one.");
				System.out.println("[s]ort three integer between 1-100.");
				System.out.println("[c]ompute a simple arithmetic.");
				System.out.print(":");
				String input = keyboard.nextLine();
				input = input.toLowerCase();
				if(input.equals("n")){
					Writer.setAuthen(0);
					System.out.print("set to ");
					System.out.println("none.");
				}else if(input.equals("s")){
					Writer.setAuthen(1);
					System.out.print("set to ");
					System.out.println("sort three integer between 1-100.");
				}else if(input.equals("c")){
					Writer.setAuthen(2);
					System.out.print("set to ");
					System.out.println("compute a simple arithmetic.");
				}else{
					System.out.println("There is nothing to do.");
				}
				System.out.println("================================");
				System.out.println("");
			}

			//input cmd
			System.out.println("\033[H\033[2J");
			System.out.println("__________Admin function__________");
			System.out.println("[lo]gin authentication setting");
			System.out.println("[q]uit to menu");
			System.out.println("__________________________________");
			System.out.print(":");
			cmd = keyboard.nextLine();
			cmd = cmd.toLowerCase();
		}

		System.out.println("");
	}
}
