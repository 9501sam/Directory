package directory.functions.admin;

import java.util.Scanner;
import directory.data.DataFrame;
import directory.data.Person;

public class Add{

	public static void run(){
		DataFrame df = new DataFrame();

		Scanner keyboard = new Scanner(System.in);

		System.out.println("================================");

		System.out.println("Add a data:");

		System.out.print("name: ");
		String name = keyboard.nextLine();

		System.out.print("birthDay: ");
		String bir = keyboard.nextLine();

		System.out.print("phoneNumber: ");
		String ph = keyboard.nextLine();

		System.out.print("EMail: ");
		String email = keyboard.nextLine();

		Person p = new Person();
		if(p.setName(name) && 
				p.setBirthDay(bir) && 
				p.setPhoneNumber(ph) &&
				p.setEMail(email)){
		df.getAllPerson().add(p);
		}else{
			System.out.println("There is nothing to do.");
		}

		System.out.println("================================");
		System.out.println("");
	}
}

