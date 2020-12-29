//https://www.geeksforgeeks.org/generating-random-numbers-in-java/
//https://www.tutorialspoint.com/java/util/arrays_sort_int.htm
package directory.login;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

import directory.fileIO.Reader;

public class Login{

	public static void run(){

		Scanner keyboard = new Scanner(System.in);

		///*****ID and Password*****///
		boolean login = false;
		String idAndPassword[] = Reader.readIDAndPassword();
		String ID = idAndPassword[0];
		String PASSWORD = idAndPassword[0];
		while(!login){
			//input id and password
			System.out.print("Please enter your id number: ");
			String inputID = keyboard.nextLine();
			System.out.print("Please enter your password: ");
			String inputPassword = keyboard.nextLine();

			if(inputID.equals(ID) && inputPassword.equals(PASSWORD)){
				login = true;
				System.out.println("id and password correct.");
				System.out.println("");
			}else{
				System.out.println("Login faild.");
			}
		}

		///*****authentication*****///
		int question = Reader.readOneNumber();
		Random rand = new Random();
		boolean authen = false;
		while(!authen){
			if(question == 0){
				authen = true;
			}else if(question == 1){ //ask user to sort three number between 1-100
				int num[] = new int[3];
				for(int i = 0; i < 3; i++)
					num[i] = rand.nextInt(100) + 1;
				Arrays.sort(num);
				System.out.print("Please sort [");
				for(int i = 0; i < 3; i++){
					System.out.print(num[i]);
					if(i != 3-1)
						System.out.print(" ");
				}
				System.out.println("] in non-decrease order for authentication.");
				System.out.print(":");
				int input[] = new int[3];
				for(int i = 0; i < 3; i++)
					input[i] = keyboard.nextInt();
				authen = true;
				for(int i = 0; i < 3; i++)
					if(input[i] != num[i]){
						authen = false;
						break;
					}
				if(authen == false)
					System.out.println("Authentication failed.");
			}else if(question == 2){ //ask user compute x [+/-/*] y = ??
				int num1 = rand.nextInt(10) + 1;
				int num2 = rand.nextInt(10) + 1;
				int op = rand.nextInt(3);
				int ans = 0;
				System.out.print("Answer following question for authentication: ");
				if(op == 0){ //"+"
					ans = num1 + num2;
					System.out.print(num1 + " + " + num2 + " = ");
				}else if(op == 1){ //"-"
					ans = num1 - num2;
					System.out.print(num1 + " - " + num2 + " = ");
				}else if(op == 2){ //"*"
					ans = num1 * num2;
					System.out.print(num1 + " * " + num2 + " = ");
				}
				int input = keyboard.nextInt();
				if(input == ans)
					authen = true;
				else
					System.out.println("Authentication failed.");
			}else{
				System.out.println(
						"There is something wrong with res/setting/authentication");
				System.exit(0);
			}
		}
		if(question != 0)
			System.out.println("Authentication success.");
		System.out.println("Login success.");
		System.out.println("");
	}
}
