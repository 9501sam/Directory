package directory;

import java.util.Scanner;

import directory.login.*;
import directory.data.*;
import directory.functions.user.*;

public class Demo{
	public static void main(String args[]){

		Login.run();

		DataFrame df = new DataFrame();

		df.printAllData();
	}
}