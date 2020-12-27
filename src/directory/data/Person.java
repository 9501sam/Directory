package directory.data;

public class Person{

	private String name;
	private String birthDay;
	private String phoneNumber;
	private String category;
	private String EMail;

	public Person(){
		name = "no name";
		birthDay = "0101";
		phoneNumber = "0000-000000";
		category = "A";
		EMail = "hahaha123@myserver.com";
	}
	
	public Person(String n, String bir, String ph, String ca, String e){
		name = n;
		birthDay = bir;
		phoneNumber = ph;
		category = ca;
		EMail = e;
	}

	public void setName(String str){
		name = str;
	}

	public void setBirthDay(String str){
		birthDay = str;
	}

	public void setPhoneNumber(String str){
		phoneNumber = str;
	}

	public void setCategory(String str){
		category = str;
	}

	public void setEMail(String str){
		EMail = str;
	}

	public String getName(){
		return name;
	}

	public String getBirthDay(){
		return birthDay;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public String getCategory(){
		return category;
	}

	public String getEMail(){
		return EMail;
	}

}
