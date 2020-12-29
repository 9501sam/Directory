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
			}else{
				System.out.println("login faild.");
				System.out.println();
			}
		}

		///*****authentication*****///
		int question = Reader.readOneNumber();
		Random rand = new Random();
		boolean authen = false;
		while(!authen){
			if(question == 0){
				authen = true;
			}
			if(question == 1){ //ask user to sort three number between 1-100
				int num[] = new int[3];
				for(int i = 0; i < 3; i++)
					num[i] = rand.nextInt(100) + 1;
				Arrays.sort(num);
				System.out.println("Please sort the three number in non-decrease order:");
				for(int i = 0; i < 3; i++)
					System.out.print(num[i] + " ");
				System.out.println("");
				int input[] = new int[3];
				for(int i = 0; i < 3; i++)
					input[i] = keyboard.nextInt();
				authen = true;
				for(int i = 0; i < 3; i++)
					if(input[i] != num[i])
						authen = false;
			}else if(question == 2){
			}else{
				System.out.println(
						"There is something wrong with res/setting/authentication");
				System.exit(0);
			}
		}

	}
}
