package directory.functions;

import java.util.Scanner;

import directory.fileIO.Reader;
import directory.functions.user.Show;
import directory.data.DataFrame;

public class UserFunction{

	public static String readCmd(){
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
		return cmd;
	}

	public static void run(){

		DataFrame df = new DataFrame();

		//input cmd
		String cmd = readCmd();

		while(!cmd.equals("q")){
			if(cmd.equals("sh")){
				Show.run(df);
			}else if(cmd.equals("se")){
				//Search.run(df);
			}else if(cmd.equals("ed")){
				//Edit.run(df);
			}else if(cmd.equals("de")){
				//Delete.run(df);
			}else{
				System.out.println("================================");
				System.out.println("Threr is nothing to do.");
				System.out.println("================================");
				System.out.println("");
			}

			//input cmd
			cmd = readCmd();
		}

		System.out.println("================================");
		System.out.println("exit user function.");
		System.out.println("================================");
		System.out.println("");
	}

}
