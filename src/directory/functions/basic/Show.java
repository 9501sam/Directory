package directory.functions.basic;

import java.util.Scanner;
import java.util.ArrayList;

import directory.data.Person;
import directory.fileIO.Reader;
import directory.data.Sort;

public class Show{

	public static void run(){

		ArrayList<Person> allPeoele = Reader.readCsvFile();

		Scanner keyboard = new Scanner(System.in);

		System.out.println("__________show option__________");
		System.out.println("show [all] data.");
		System.out.println("choose [a] relationship to show");
		System.out.println("_______________________________");
		System.out.print(":");
		String cmd = keyboard.nextLine().toLowerCase();

		if(cmd.equals("all")){
			//print
			allPeoele = Sort.sortPeople(allPeoele);

			System.out.print("\033[H\033[2J");
			System.out.println("============================================");
			for(int i = 0; i < allPeoele.size(); i++){
				allPeoele.get(i).printPerson();
				System.out.println("");
			}
			System.out.println("============================================");
		}else if(cmd.equals("a")){

			allPeoele = Sort.sortPeople(allPeoele);

			System.out.println("choose an relation to show");
			String rela[] = Reader.readRelationship();
			for(int i = 0; i < rela.length; i++){
				System.out.println("[" + i + "]" + rela[i]);
			}
			System.out.print(":");
			Integer n = Integer.valueOf(keyboard.nextLine());

			if(0 <= n && n < rela.length){
				System.out.print("\033[H\033[2J");
				System.out.println("======================================");
				for(int i = 0; i < allPeoele.size(); i++){
					if(allPeoele.get(i).getRelationship().equals(rela[n])){
						allPeoele.get(i).printPerson();
						System.out.println();
					}
				}
				System.out.println("======================================");
			}else{
				System.out.print("\033[H\033[2J");
				System.out.println("=================");
				System.out.println("error");
				System.out.println("=================");
			}

		}
	}
}
