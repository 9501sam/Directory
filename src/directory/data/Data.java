package directory.data;

import java.util.HashMap;

public class Data extends Person{

	private Person basicAttribute = new Person();
	private HashMap<String, String> additionAttribute = 
		new HashMap<String, String>();

	public Data(){
	}

	public Data(String[] header, String[] value){
		for(int i = 0; i < header.length; i++){
			setData(header[i], value[i]);
		}
	}

	public void setData(String key, String value){
		if(key.equals("name")){
			basicAttribute.setName(value);
		}else if(key.equals("birthDay")){
			basicAttribute.setBirthDay(value);
		}else if(key.equals("phoneNumber")){
			basicAttribute.setPhoneNumber(value);
		}else if(key.equals("category")){
			basicAttribute.setCategory(value);
		}else if(key.equals("EMail")){
			basicAttribute.setEMail(value);
		}else{
			additionAttribute.put(key, value);
		}
	}

	public String getData(String key){
		if(key.equals("name")){
			return basicAttribute.getName();
		}else if(key.equals("birthDay")){
			return basicAttribute.getBirthDay();
		}else if(key.equals("phoneNumber")){
			return basicAttribute.getPhoneNumber();
		}else if(key.equals("category")){
			return basicAttribute.getCategory();
		}else if(key.equals("EMail")){
			return basicAttribute.getEMail();
		}else{
			return additionAttribute.get(key);
		}
	}

	public void printData(){
	}

}
