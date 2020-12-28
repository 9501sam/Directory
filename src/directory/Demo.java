package directory;

import java.util.Scanner;

import directory.login.Login;
import directory.data.DataFrame;
import directory.functions.user.UserFunction;
import directory.functions.admin.AdminFunction;

public class Demo{
	public static void main(String args[]){
		Login.run();

		System.out.print("\n[A]dmin_function [U]ser_function [Q]uit: ");
		Scanner keyboard = new Scanner(System.in);
		String cmd = keyboard.nextLine();
		cmd = cmd.toUpperCase();

		while(!cmd.equals("Q")){

			if(cmd.equals("A")){
				AdminFunction.run();
			}else if(cmd.equals("U")){
				UserFunction.run();
			}

			System.out.print("\n[A]dmin_function [U]ser_function [Q]uit: ");
			cmd = keyboard.nextLine();
			cmd = cmd.toUpperCase();
		}
	}
}
