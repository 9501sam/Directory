//https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
package directory.data;

import java.util.ArrayList;

import directory.fileIO.Reader;
//import directory.data.sort.DataFrameSort;

public class DataFrame extends Person {

	///*****data member*****///
	private String header[] = {"name", "birthDay", "phoneNumber", "Email"};
	private ArrayList<Person> allPerson = new ArrayList<Person>();
	private String sortAttri = "";
	private boolean gt = true;

	///*****constructor*****///
	public DataFrame(){
		allPerson = Reader.readCsvFile();
	}

	///*****get*****///
	public String[] getHeader(){
		return header;
	}
	public ArrayList<Person> getAllPerson(){
		return allPerson;
	}

	///*****print*****///
	//header
	public void printAHeader(String key){
		if(key.equals("name")){
			System.out.printf("%-10.10s", key);
		}else if(key.equals("birthDay")){
			System.out.printf("%-10.10s", key);
		}else if(key.equals("phoneNumber")){
			System.out.printf("%-12.12s", key);
		}else if(key.equals("EMail")){
			System.out.printf("%-24.24s", key);
		}
	}
	public void printAllHeader(){
		for(int i = 0; i < header.length; i++)
			printAHeader(header[i]);
		System.out.println("");
	}
	public void printAllHeaderInCol(){
		System.out.println("[name]");
		System.out.println("[birthDay]");
		System.out.println("[phoneNumber]");
		System.out.println("[EMail]");
		System.out.print(":");
	}
	//Person
	public void printACell(String key, int i){
		allPerson.get(i).printValueOf(key);
	}
	public void printAPerson(int i){ // ith row
		allPerson.get(i).printPerson();
		System.out.println("");
	}
	public void printAllPerson(){
		for(int i = 0; i < allPerson.size(); i++){
			printAPerson(i);
		}
	}
	//col
	public void printCol(String key){
		printAHeader(key);
		System.out.println("");
		for(int i = 0;  i < allPerson.size(); i++){
			printACell(key, i);
			System.out.println("");
		}
	}

}

