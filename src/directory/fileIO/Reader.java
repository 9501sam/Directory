package directory.fileIO;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.ArrayList;

import directory.data.Data;

public class Reader{

	//for DataFrame to read Header
	public static String[] readHeader(){
		Scanner inputStream = null;
		try{
			inputStream = new Scanner(new FileInputStream("res/data.csv"));
		}catch(FileNotFoundException e){
			System.out.println("Error in directory.fileIO.Reader:");
			System.out.println("res/data.csv not found.");
		}
		String firstLineInFile = inputStream.nextLine();
		String header[] = firstLineInFile.split(",");
		return header;
	}

	//for DataFrame to read AllData
	public static ArrayList<Data> readCsvFile(){
		Scanner inputStream = null;
		try{
			inputStream = new Scanner(new FileInputStream("res/data.csv"));
		}catch(FileNotFoundException e){
			System.out.println("Error in directory.fileIO.Reader:");
			System.out.println("res/data.csv not found.");
		}
		String header[] = inputStream.nextLine().split(",");
		ArrayList<Data> allData = new ArrayList<Data>();
		while(inputStream.hasNextLine()){
			String line[] = inputStream.nextLine().split(",");
			Data aData = new Data(header, line);
			allData.add(aData);
		}
		return allData;
	}

	//for Login to read authentication
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
