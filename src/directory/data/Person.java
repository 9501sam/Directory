package directory.data;

import directory.fileIO.Reader;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Person{

	///*****data member*****///
	private String name;
	private String birthDay;
	private String phoneNumber;
	private String EMail;
	private String relationship;

	///*****constructor*****///
	public Person(){
		name = "no name";
		birthDay = "0101";
		phoneNumber = "0000-000000";
		EMail = "hahaha123@myserver.com";
		relationship = "friend";
	}
	public Person(String n, String bir, String ph, String e, String re){
		setName(n);
		setBirthDay(bir);
		setPhoneNumber(ph);
		setEMail(e);
		setRelationship(re);
	}

	///*****set*****///
	public boolean setName(String str){
		name = str;
		return true;
	}
	public boolean setBirthDay(String str){
		int month = Integer.valueOf(str.substring(0,2));
		int day = Integer.valueOf(str.substring(2,4));
		if(str.length() != 4 ||
				month < 1 || 12 < month ||
				day < 1 || 31 < day){
			System.out.printf(
					"Error: incorrect birthDay format.\n");
			System.out.println("setBirthDay failed.");
			return false;
		}
		birthDay = str;
		return true;
	}
	public boolean setPhoneNumber(String str){ //XXXX-XXXXXX
		boolean rightFormat = true;
		if(str.length() != 11)
			rightFormat = false;
		if(str.charAt(4) != '-')
			rightFormat = false;
		for(int i = 0; i < str.length(); i++){
			if(i == 4)
				continue;
			if(str.charAt(i) < '0' || str.charAt(i) > '9'){
				rightFormat = false;
				break;
			}
		}
		if(!rightFormat){
			System.out.println("Error: wrong phoneNumber format.");
			System.out.println("setPhoneNumber failed.");
			return false;
		}
		phoneNumber = str;
		return true;
	}
	public boolean setEMail(String str){
		int atIndex = 0; //"@"
		int dotIndex = 0; // @xxxxx"."xxx
		for(int i = 0; i < str.length(); i++)
			if(str.charAt(i) == '@')
				atIndex = i;
		for(int i = atIndex; i < str.length(); i++)
			if(str.charAt(i) == '.')
				dotIndex = i;
		if( !(0 < atIndex && atIndex < str.length() && 
					atIndex < dotIndex && dotIndex < str.length()) ){
			System.out.println("Error incorrec EMail format.");
			System.out.println("setEMail failed.");
			return false;
					}
		EMail = str;
		return true;
	}
	public boolean setRelationship(String str){
		String rela[] = Reader.readRelationship();
		for(int i = 0; i < rela.length; i++){
			if(str = rela[i]){
				relationship = str;
				return true;
			}
		}
		return false;
	}
	public boolean setRelationship(){
		System.out.println("choose an relationship: ");
		String rela[] = Reader.readRelationship();
		for(int i = 0; i < rela.length; i++)
			System.out.println("[" + i + "]" + rela[i]);
		Scanner keyboard = new Scanner(System.in);
		String in = keyboard.nextLine();
		int n = Integer.valueOf(in);
		if(0 <= n && n < rela.length){
			relationship = rela[n];
			return true;
		}
		return false;
	}
	public boolean setValueOf(String key, String value){
		if(key.equalsIgnoreCase("name")){
			setName(value);
		}else if(key.equalsIgnoreCase("birthDay")){
			setBirthDay(value);
		}else if(key.equalsIgnoreCase("phoneNumber")){
			setPhoneNumber(value);
		}else if(key.equalsIgnoreCase("EMail")){
			setEMail(value);
		}else if(key.equalsIgnoreCase("relationship")){
			setRelationship(value);
		}
		return false;
	}

	///*****get*****///
	public String getName(){return name;}
	public String getBirthDay(){return birthDay;}
	public String getPhoneNumber(){return phoneNumber;}
	public String getEMail(){return EMail;}
	public String getRelationship(){return relationship;}
	public String getValueOf(String key){
		if(key.equalsIgnoreCase("name")){
			return getName();
		}else if(key.equalsIgnoreCase("birthDay")){
			return getBirthDay();
		}else if(key.equalsIgnoreCase("phoneNumber")){
			return getPhoneNumber();
		}else if(key.equalsIgnoreCase("EMail")){
			return getEMail();
		}else if(key.equalsIgnoreCase("relationship")){
			return getRelationship();
		}
		return "";
	}

	///*****print*****///
	public void printName(){System.out.print(getName());}
	public void printBirthDay(){System.out.printf(getBirthDay());}
	public void printPhoneNumber(){System.out.printf(getPhoneNumber());}
	public void printEMail(){System.out.printf(getEMail());}
	public void printRelationship(){System.out.printf(getRelationship());}
	public void printPerson(){
		printName();
		System.out.print(",");
		printBirthDay();
		System.out.print(",");
		printPhoneNumber();
		System.out.print(",");
		printEMail();
		System.out.print(",");
		printRelationship();
	}
	//public void printValueOf(String key){
	//	if(key.equalsIgnoreCase("name")){
	//		printName();
	//	}else if(key.equalsIgnoreCase("birthDay")){
	//		printBirthDay();
	//	}else if(key.equalsIgnoreCase("phoneNumber")){
	//		printPhoneNumber();
	//	}else if(key.equalsIgnoreCase("EMail")){
	//		printEMail();
	//	}
	//}
}

