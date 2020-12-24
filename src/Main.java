import java.util.Scanner;
import javax.swing.JPasswordField;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		boolean login = false;
		String ID = "cis";
		String PASSWORD = "1234";


		JPasswordField pf = new JPasswordField();

		while(!login){
			String id;
			System.out.print("Please enter your id number: ");
			id = sc.nextLine();

			String password;
			System.out.print("Please enter your password: ");
			password = sc.nextLine();

			if(id.equals(ID) && password.equals(PASSWORD)){
				login = true;
				System.out.println("success login.");
				System.out.println();
			}else{
				System.out.println("login faild.");
				System.out.println();
			}
		}
	}
}
