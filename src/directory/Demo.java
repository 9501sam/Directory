package directory;

import java.util.Scanner;

import directory.login.*;
import directory.data.*;

public class Demo{
	public static void main(String args[]){

		Login.run();

		DataFrame df = new DataFrame();

		System.out.println(df.getTable());
	}
}
