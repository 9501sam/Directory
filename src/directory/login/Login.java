package directory.login;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Login{

	public static void run(){

		//System.out.println(System.getProperty("user.dir"));
		Scanner keyboard = new Scanner(System.in);
		Scanner scan = null;
		try{
			scan = new Scanner(new FileInputStream("res/idAndPassword.txt"));
		}catch(FileNotFoundException e){
			System.out.println("Error: file idAndPassword Not Found.");
			System.exit(0);
		}

		boolean login = false;
		String ID = scan.next();
		String PASSWORD = scan.next();

		while(!login){
			String id;
			System.out.print("Please enter your id number: ");
			id = keyboard.nextLine();

			String password;
			System.out.print("Please enter your password: ");
			password = keyboard.nextLine();

			if(id.equals(ID) && password.equals(PASSWORD)){
				login = true;
				System.out.println("login successed.");
			}else{
				System.out.println("login faild.");
				System.out.println();
			}
		}

	}
		
}
