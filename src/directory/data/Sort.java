package directory.data;

import directory.data.Person;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Sort{
	///*****sort*****///
	public static void sortBy(ArrayList<Person> all, String key, String order){
		if(key.equals("name")){
			if(order.equals("in")){
				Collections.sort(all, new nameComparator());
			}else if(order.equals("de")){
				Collections.sort(all, new nameComparator2());
			}
		}else if(key.equals("birthDay")){
			if(order.equals("in")){
				Collections.sort(all, new birthDayComparator());
			}else if(order.equals("de")){
				Collections.sort(all, new birthDayComparator2());
			}
		}else if(key.equals("phoneNumber")){
			if(order.equals("in")){
				Collections.sort(all, new phoneNumberComparator());
			}else if(order.equals("de")){
				Collections.sort(all, new phoneNumberComparator2());
			}
		}else if(key.equals("EMail")){
			if(order.equals("in")){
				Collections.sort(all, new EMailComparator());
			}else if(order.equals("de")){
				Collections.sort(all, new EMailComparator2());
			}
		}
	}
}

class nameComparator implements Comparator<Person>{
	public int compare(Person a, Person b){
		return a.getName().compareTo(b.getName());
	}
}
class birthDayComparator implements Comparator<Person>{
	public int compare(Person a, Person b){
		return a.getBirthDay().compareTo(b.getBirthDay());
	}
}
class phoneNumberComparator implements Comparator<Person>{
	public int compare(Person a, Person b){
		return a.getPhoneNumber().compareTo(b.getPhoneNumber());
	}
}
class EMailComparator implements Comparator<Person>{
	public int compare(Person a, Person b){
		return a.getEMail().compareTo(b.getEMail());
	}
}

class nameComparator2 implements Comparator<Person>{
	public int compare(Person a, Person b){
		return b.getName().compareTo(a.getName());
	}
}
class birthDayComparator2 implements Comparator<Person>{
	public int compare(Person a, Person b){
		return b.getBirthDay().compareTo(a.getBirthDay());
	}
}
class phoneNumberComparator2 implements Comparator<Person>{
	public int compare(Person a, Person b){
		return b.getPhoneNumber().compareTo(a.getPhoneNumber());
	}
}
class EMailComparator2 implements Comparator<Person>{
	public int compare(Person a, Person b){
		return b.getEMail().compareTo(a.getEMail());
	}
}
