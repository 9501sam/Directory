package directory.data;

public class Person{

	///*****data member*****///
	private String name;
	private String birthDay;
	private String phoneNumber;
	private String EMail;
	//size
	private int MAX_NAME_SIZE = 9;
	private int BIRTHDAY_SIZE = 4;
	private int PHONE_NUMBER_SIZE = 11;
	private int MAX_EMAIL_SIZE = 24;

	///*****constructor*****///
	public Person(){
		name = "no name";
		birthDay = "0101";
		phoneNumber = "0000-000000";
		EMail = "hahaha123@myserver.com";
	}
	public Person(String n, String bir, String ph, String ca, String e){
		setName(n);
		setBirthDay(bir);
		setPhoneNumber(ph);
		setEMail(e);
	}

	///*****set*****///
	public boolean setName(String str){
		if(str.length() > MAX_NAME_SIZE){
			System.out.printf(
					"Error: length of name should be less than %d.\n",MAX_NAME_SIZE);
			System.out.println("setName failed.");
			return false;
		}
		name = str;
		return true;
	}
	public boolean setBirthDay(String str){
		int month = Integer.valueOf(str.substring(0,2));
		int day = Integer.valueOf(str.substring(2,4));
		if(str.length() != BIRTHDAY_SIZE ||
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
		if(str.length() != PHONE_NUMBER_SIZE)
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
		if(str.length() > MAX_EMAIL_SIZE){
			System.out.println(
					"Error: length of EMail should be less than %d.");
			System.out.println("setEMail failed.");
			return false;
		}
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

	///*****get*****///
	public String getName(){return name;}
	public String getBirthDay(){return birthDay;}
	public String getPhoneNumber(){return phoneNumber;}
	public String getEMail(){return EMail;}

	///*****print*****///
	public void printName(){System.out.printf(
			"%-10.10s",getName());}
	public void printBirthDay(){System.out.printf(
			"%-10.10s",getBirthDay());}
	public void printPhoneNumber(){System.out.printf(
			"%-12.12s",getPhoneNumber());}
	public void printEMail(){System.out.printf(
			"%-24.24s",getEMail());}
	public void printPerson(){
		printName();
		printBirthDay();
		printPhoneNumber();
		printEMail();
	}

}
