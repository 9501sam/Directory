package directory.login;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import directory.fileIO.Reader;

public class Login{

	public static void run(){

		///*****ID and Password*****///
		Scanner keyboard = new Scanner(System.in);
		boolean login = false;
		String idAndPassword[] = Reader.readIDAndPassword();
		String ID = idAndPassword[0];
		String PASSWORD = idAndPassword[0];
		while(!login){
			System.out.print("Please enter your id number: ");
			String inputID = keyboard.nextLine();
		

			System.out.print("Please enter your password: ");
			String inputPassword = keyboard.nextLine();

			if(inputID.equals(ID) && inputPassword.equals(PASSWORD)){
				login = true;
				System.out.println("login successed.");
			}else{
				System.out.println("login faild.");
				System.out.println();
			}
		}

		///*****authentication*****///
		int question = Reader.readOneNumber();
		if(question == 1){
		}else if(question == 2){
		}


	}
		
}
