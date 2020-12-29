package directory.fileIO;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class Writer{
	public static void setAuthen(int n){
		PrintWriter outputStream = null;
		try{
			outputStream = 
				new PrintWriter(
						new FileOutputStream("res/setting/authentication"));
		}catch (FileNotFoundException e){
			System.out.print("Error in Writer: ");
			System.out.println("res/setting/authentication not fount");
			System.exit(0);
		}
		outputStream.print(Integer.toString(n));
		outputStream.close();
	}
}
