package directory.fileIO;

import directory.data.Person;
import directory.fileIO.Reader;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Writer{
	public static PrintWriter getPrintWriter(String path){
		PrintWriter temp = null;
		try{
			temp = new PrintWriter(new FileOutputStream(path));
		}catch(FileNotFoundException e){
			System.out.println("Error in Writer");
		}
		return temp;
	}

	///*****for admin*****///
	public static void setAuthen(int n){
		PrintWriter outputStream = getPrintWriter("res/setting/authentication");
		outputStream.print(Integer.toString(n));
		outputStream.close();
	}

	///*****save to data.csv*****///
	public static void saveCsvFile(ArrayList<Person> all){
		PrintWriter outputStream = getPrintWriter("res/data.csv");
		outputStream.println("name,birthDay,phoneNumber,EMail,relationship");
		for(int i = 0; i < all.size(); i++){
			outputStream.print(all.get(i).getName() + ",");
			outputStream.print(all.get(i).getBirthDay() + ",");
			outputStream.print(all.get(i).getPhoneNumber() + ",");
			outputStream.print(all.get(i).getEMail() + ",");
			outputStream.print(all.get(i).getRelationship());
			outputStream.println("");
		}
		outputStream.close();
	}

	///*****add relationship*****///
	public static void addRelationship(String str){
		String rela[] = Reader.readRelationship();
		PrintWriter outputStream = getPrintWriter("res/setting/relationship");
		for(int i = 0; i < rela.length; i++){
			outputStream.print(rela[i]);
			outputStream.print(",");
		}
		outputStream.print(str);
		outputStream.close();
	}
}
