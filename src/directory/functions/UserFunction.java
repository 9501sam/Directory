package directory.functions;

import java.util.Scanner;

import directory.fileIO.Reader;

import directory.functions.basic.Show;
import directory.functions.basic.Search;
import directory.functions.basic.Edit;
import directory.functions.basic.Delete;
import directory.functions.basic.Add;

public class UserFunction{

	public static String readCmd(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("__________User function__________");
		System.out.println("[sh]ow data");
		System.out.println("[se]arch data");
		System.out.println("[ad]d data");
		System.out.println("[q]uit to menu");
		System.out.println("_________________________________");
		System.out.print(":");
		String cmd = keyboard.nextLine();
		cmd = cmd.toLowerCase();
		return cmd;
	}

	public static void run(){

		//input cmd
		String cmd = readCmd();

		while(!cmd.equals("q")){
			if(cmd.equals("sh")){
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
			}else if(cmd.equals("ad")){
				System.out.print("\033[H\033[2J");
				System.out.println("==================");
				System.out.println("add new data");
				System.out.println("==================");
				Add.run();
			}
			//input cmd
			cmd = readCmd();
		}

		System.out.print("\033[H\033[2J");
		System.out.println("================================");
		System.out.println("exit user function.");
		System.out.println("================================");
	}

}
