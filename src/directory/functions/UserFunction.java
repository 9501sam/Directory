package directory.functions;

import java.util.Scanner;

import directory.fileIO.Reader;
import directory.data.DataFrame;

public class UserFunction{

	public static void run(){
		//input cmd
		Scanner keyboard = new Scanner(System.in);
		System.out.println("__________User function__________");
		System.out.println("[sh]ow data");
		System.out.println("[se]arch data");
		System.out.println("[ed]it data");
		System.out.println("[de]lete data");
		System.out.println("[q]uit to menu");
		System.out.print(":");
		String cmd = keyboard.nextLine();
		cmd = cmd.toLowerCase();

		while(!cmd.equals("q")){
			if(cmd.equals("sh")){
			}else if(cmd.equals("se")){
			}else if(cmd.equals("ed")){
			}else if(cmd.equals("de")){
			}

			//input cmd
			System.out.println("__________User function__________");
			System.out.println("[sh]ow data");
			System.out.println("[se]arch data");
			System.out.println("[ed]it data");
			System.out.println("[de]lete data");
			System.out.println("[q]uit to menu");
			System.out.print(":");
			cmd = keyboard.nextLine();
			cmd = cmd.toLowerCase();
		}

		System.out.println("================================");
		System.out.println("exit user function.");
		System.out.println("================================");
		System.out.println("");
	}

}
