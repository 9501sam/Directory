package directory.data;

import java.util.HashMap;

public class Data extends Person{

	///*****data member*****///
	private Person person = new Person();
	private HashMap<String, String> category = 
		new HashMap<String, String>();
	private int MAX_SIZE = 9;

	///*****constructor*****///
	public Data(){
	}
	public Data(String[] header, String[] value){
		for(int i = 0; i < header.length; i++){
			setValueOf(header[i], value[i]);
		}
	}

	///*****set*****///
	public boolean setValueOf(String key, String value){
		if(key.equals("name")){
			person.setName(value);
		}else if(key.equals("birthDay")){
			person.setBirthDay(value);
		}else if(key.equals("phoneNumber")){
			person.setPhoneNumber(value);
		}else if(key.equals("EMail")){
			person.setEMail(value);
		}else{
			if(key.length() > MAX_SIZE || value.length() > MAX_SIZE){
				System.out.println("Error: length of key or length of value too long.");
				return false;
			}
			category.put(key, value);
			return true;
		}
		return false;
	}

	///*****get*****///
	public String getValueOf(String key){
		if(key.equals("name")){
			return person.getName();
		}else if(key.equals("birthDay")){
			return person.getBirthDay();
		}else if(key.equals("phoneNumber")){
			return person.getPhoneNumber();
		}else if(key.equals("EMail")){
			return person.getEMail();
		}else{
			return category.get(key);
		}
	}

	///*****print*****///
	public void printHeaderOf(String key){
		if(key.equals("name")){
			System.out.printf("%-10.10s", key);
		}else if(key.equals("birthDay")){
			System.out.printf("%-10.10s", key);
		}else if(key.equals("phoneNumber")){
			System.out.printf("%-12.12s", key);
		}else if(key.equals("EMail")){
			System.out.printf("%-24.24s", key);
		}else{
			System.out.printf("%-10.10s", key);
		}
	}
	public void printValueOf(String key){
		if(key.equals("name")){
			person.printName();
		}else if(key.equals("birthDay")){
			person.printBirthDay();
		}else if(key.equals("phoneNumber")){
			person.printPhoneNumber();
		}else if(key.equals("EMail")){
			person.printEMail();
		}else{
			System.out.printf("%-10.10s", getValueOf(key));
		}
	}

}
