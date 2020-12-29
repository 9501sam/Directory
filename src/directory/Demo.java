package directory;

import java.util.Scanner;

import directory.login.Login;
import directory.data.DataFrame;
import directory.functions.user.UserFunction;
import directory.functions.admin.AdminFunction;

public class Demo{
	public static void main(String args[]){
		Login.run();

		System.out.println("__________Main menu__________");
		System.out.println("[A]dmin function");
		System.out.println("[U]ser function");
		System.out.println("[Q]uit");
		System.out.print(":");
		Scanner keyboard = new Scanner(System.in);
		String cmd = keyboard.nextLine();
		cmd = cmd.toUpperCase();

		while(!cmd.equals("Q")){

			if(cmd.equals("A")){
				System.out.println("enter admin function");
				System.out.println("");
				AdminFunction.run();
			}else if(cmd.equals("U")){
				UserFunction.run();
			}

			System.out.println("__________Main menu__________");
			System.out.println("[A]dmin function");
			System.out.println("[U]ser function");
			System.out.println("[Q]uit");
			System.out.print(":");
			cmd = keyboard.nextLine();
			cmd = cmd.toUpperCase();
		}
	}
}
