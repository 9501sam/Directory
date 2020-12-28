package directory.data;

import directory.fileIO.Reader;
import directory.functions.user.*;
import java.util.ArrayList;

public class DataFrame extends Data{

	private String header[] = null;
	private ArrayList<Data> allData = new ArrayList<Data>();

	public DataFrame(){
		header = Reader.readHeader();
		allData = Reader.readCsvFile();
	}

	public String[] getHeader(){
		return header;
	}
	public ArrayList<Data> getAllData(){
		return allData;
	}

	public void printAllData(){
		for(int i = 0; i < header.length; i++){
			System.out.print(getHeader()[i] + ",");
		}
		System.out.println();
		for(int i = 0; i < allData.size(); i++){ //print a data
			for(int j = 0; j < header.length; j++){
				System.out.print(allData.get(i).getValueOf(header[j]));
				System.out.print(",");
			}
			System.out.println();
		}
	}

}

