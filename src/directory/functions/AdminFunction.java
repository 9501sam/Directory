package directory.functions;

import java.util.Scanner;

import directory.fileIO.Writer;
import directory.functions.basic.*;
import directory.functions.advanced.ChooseQuestion;

public class AdminFunction{
	public static void run(){
		//input cmd
		Scanner keyboard = new Scanner(System.in);
		System.out.println("__________Admin function__________");
		System.out.println("[sh]ow data");
		System.out.println("[se]arch data");
		System.out.println("[lo]gin authentication setting");
		System.out.println("[q]uit to menu");
		System.out.println("__________________________________");
		System.out.print(":");
		String cmd = keyboard.nextLine();
		cmd = cmd.toLowerCase();

		while(!cmd.equals("q")){
			////*****a;sldkfj******///
			if(cmd.equalsIgnoreCase("sh")){
				System.out.print("\033[H\033[2J");
				System.out.println("=================");
				System.out.println("chose show option");
				System.out.println("=================");
				Show.run();
			}else if(cmd.equals("se")){
				System.out.print("\033[H\033[2J");
				System.out.println("==================");
				System.out.println("chose search option");
				System.out.println("==================");
				Search.run();
			}else if(cmd.equals("lo")){
				ChooseQuestion.run();
			}

			//input cmd
			System.out.println("__________Admin function__________");
			System.out.println("[sh]ow data");
			System.out.println("[se]arch data");
			System.out.println("[lo]gin authentication setting");
			System.out.println("[q]uit to menu");
			System.out.println("__________________________________");
			System.out.print(":");
			cmd = keyboard.nextLine();
			cmd = cmd.toLowerCase();
		}

		System.out.print("\033[H\033[2J");
		System.out.println("================================");
		System.out.println("exit admin function.");
		System.out.println("================================");
	}
}
