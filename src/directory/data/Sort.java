package directory.data;

import directory.data.Person;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Sort{
	///*****sort*****///
	public static ArrayList<Person> sortPeople(ArrayList<Person> all){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("chose sort option:");
		System.out.println("[none/name/birthDay/phoneNumber/Email/relationship]");
		System.out.print(":");
		String key = keyboard.nextLine();
		String order = "";
		if(!key.equalsIgnoreCase("none")){
			System.out.println("[in/de]");
			System.out.print(":");
			order = keyboard.nextLine();
		}
		if(key.equalsIgnoreCase("name")){
			if(order.equalsIgnoreCase("in")){
				Collections.sort(all, new nameComparator());
			}else if(order.equalsIgnoreCase("de")){
				Collections.sort(all, new nameComparator2());
			}
		}else if(key.equalsIgnoreCase("birthDay")){
			if(order.equalsIgnoreCase("in")){
				Collections.sort(all, new birthDayComparator());
			}else if(order.equalsIgnoreCase("de")){
				Collections.sort(all, new birthDayComparator2());
			}
		}else if(key.equalsIgnoreCase("phoneNumber")){
			if(order.equalsIgnoreCase("in")){
				Collections.sort(all, new phoneNumberComparator());
			}else if(order.equalsIgnoreCase("de")){
				Collections.sort(all, new phoneNumberComparator2());
			}
		}else if(key.equalsIgnoreCase("EMail")){
			if(order.equalsIgnoreCase("in")){
				Collections.sort(all, new EMailComparator());
			}else if(order.equalsIgnoreCase("de")){
				Collections.sort(all, new EMailComparator2());
			}
		}

		return all;
	}
}

//class nameComparator implements Comparator<Person>{
//	public int compare(Person a, Person b){
//		return a.getName().compareTo(b.getName());
//	}
//}
//class birthDayComparator implements Comparator<Person>{
//	public int compare(Person a, Person b){
//		return a.getBirthDay().compareTo(b.getBirthDay());
//	}
//}
//class phoneNumberComparator implements Comparator<Person>{
//	public int compare(Person a, Person b){
//		return a.getPhoneNumber().compareTo(b.getPhoneNumber());
//	}
//}
//class EMailComparator implements Comparator<Person>{
//	public int compare(Person a, Person b){
//		return a.getEMail().compareTo(b.getEMail());
//	}
//}
//
//class nameComparator2 implements Comparator<Person>{
//	public int compare(Person a, Person b){
//		return b.getName().compareTo(a.getName());
//	}
//}
//class birthDayComparator2 implements Comparator<Person>{
//	public int compare(Person a, Person b){
//		return b.getBirthDay().compareTo(a.getBirthDay());
//	}
//}
//class phoneNumberComparator2 implements Comparator<Person>{
//	public int compare(Person a, Person b){
//		return b.getPhoneNumber().compareTo(a.getPhoneNumber());
//	}
//}
//class EMailComparator2 implements Comparator<Person>{
//	public int compare(Person a, Person b){
//		return b.getEMail().compareTo(a.getEMail());
//	}
//}
