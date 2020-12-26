package directory.login;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class login{

	public static void run(){

		//System.out.println(System.getProperty("user.dir"));
		Scanner keyboard = new Scanner(System.in);
		Scanner scan = null;
		try{
			scan = new Scanner(new FileInputStream("res/idAndPassword.txt"));
		}catch(FileNotFoundException e){
			System.out.println("Error: res/idAndPassword Not Found.");
		}

		boolean login = false;
		String ID = scan.nextLine();
		String PASSWORD = scan.nextLine();

		while(!login){
			String id;
			System.out.print("Please enter your id number: ");
			id = keyboard.nextLine();

			String password;
			System.out.print("Please enter your password: ");
			password = keyboard.nextLine();

			if(id.equals(ID) && password.equals(PASSWORD)){
				login = true;
				System.out.println("login successed");
				System.out.println();
			}else{
				System.out.println("login faild.");
				System.out.println();
			}
		}

	}
		
}
