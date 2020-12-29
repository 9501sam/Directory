package directory.functions.admin;

import java.util.Scanner;
import directory.data.DataFrame;

public class AdminFunction{
	public static void run(){
		//input cmd
		Scanner keyboard = new Scanner(System.in);
		System.out.println("__________Admin function__________");
		System.out.println("[lo]gin authentication setting");
		System.out.println("[q]uit to menu");
		System.out.print(":");
		String cmd = keyboard.nextLine();
		cmd = cmd.toLowerCase();

		while(!cmd.equals("q")){
			if(cmd.equals("lo")){
				//System.out.print("")
			}

			//input cmd
			System.out.println("__________Admin function__________");
			System.out.println("[lo]gin authentication setting");
			System.out.println("[q]uit to menu");
			System.out.print(":");
			cmd = keyboard.nextLine();
			cmd = cmd.toLowerCase();
		}

		System.out.println("exit admin function.");
		System.out.println("");
	}
}
