package directory.fileIO;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

import directory.data.Person;
import java.util.ArrayList;

public class Writer{

	///*****for admin*****///
	public static void setAuthen(int n){
		PrintWriter outputStream = null;
		try{
			outputStream = 
				new PrintWriter(
						new FileOutputStream("res/setting/authentication"));
		}catch (FileNotFoundException e){
			System.out.print("Error in Writer: ");
			System.out.println("res/setting/authentication not fount");
			System.exit(0);
		}
		outputStream.print(Integer.toString(n));
		outputStream.close();
	}

	public static void saveCsvFile(ArrayList<Person> all){
		PrintWriter outputStream = null;
		try{
			outputStream = 
				new PrintWriter(
						new FileOutputStream("res/data.csv"));
		}catch (FileNotFoundException e){
			System.out.print("Error in Writer: ");
			System.out.println("res/data.csv not fount");
			System.exit(0);
		}
		outputStream.println("name,birthDay,phoneNumber,EMail");
		for(int i = 0; i < all.size(); i++){
			outputStream.print(all.get(i).getName() + ",");
			outputStream.print(all.get(i).getBirthDay() + ",");
			outputStream.print(all.get(i).getPhoneNumber() + ",");
			outputStream.print(all.get(i).getEMail());
			outputStream.println("");
		}
		outputStream.close();
	}
}
