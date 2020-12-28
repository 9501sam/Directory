package directory.functions.user;

import directory.fileIO.CsvReader;
import directory.data.DataFrame;

public class UserFunction{

	public static void printAllData(DataFrame df){
		int headerSize = df.getHeader().length;
		for(int i = 0; i < headerSize; i++){
			System.out.print(df.getHeader()[i] + "\t");
		}
		System.out.println();
		//print all df.allData
		int peopleAmount = df.getAllData().size();
		for(int i = 0; i < peopleAmount; i++){ //print a data
			for(int j = 0; j < headerSize; j++){
				System.out.print(df.getAllData().get(i).getData(df.getHeader()[j]));
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
