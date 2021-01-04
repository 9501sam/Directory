package directory.fileIO;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.ArrayList;

import directory.data.Person;

public class Reader{

	///*****DataFrame to read AllData*****///
	public static ArrayList<Person> readCsvFile(){
		Scanner inputStream = null;
		try{
			inputStream = new Scanner(new FileInputStream("res/data.csv"));
		}catch(FileNotFoundException e){
			System.out.println("Error in directory.fileIO.Reader:");
			System.out.println("res/data.csv not found.");
		}
		String header[] = inputStream.nextLine().split(",");
		ArrayList<Person> allPerson = new ArrayList<Person>();
		while(inputStream.hasNextLine()){
			String line[] = inputStream.nextLine().split(",");
			if(line.length == 4){
				Person aPerson = new Person(line[0], line[1], line[2], line[3]);
				allPerson.add(aPerson);
			}
		}
		return allPerson;
	}

	///*****Login to read id and password*****//
	public static String[] readIDAndPassword(){
		Scanner inputStream = null;
		try{
			inputStream = new Scanner(new FileInputStream(
						"res/idAndPassword.txt"));
		}catch(FileNotFoundException e){
			System.out.println("Error in directory.fileIO.Reader:");
			System.out.println("idAndPassword.txt not found.");
		}
		String[] IDAndPassword = inputStream.nextLine().split(" ");
		return IDAndPassword;
	}
	
	///*****Login to read authentication*****///
	public static int readOneNumber(){
		Scanner inputStream = null;
		try{
			inputStream = new Scanner(new FileInputStream(
						"res/setting/authentication"));
		}catch(FileNotFoundException e){
			System.out.println("Error in directory.fileIO.Reader:");
			System.out.println("res/setting/authentication not found.");
		}
		int num = inputStream.nextInt();
		return num;
	}

}
