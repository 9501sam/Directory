package directory.data;

import directory.fileIO.Reader;
import java.util.ArrayList;

public class DataFrame extends Data{

	///*****data member*****///
	private String header[] = null;
	private ArrayList<Data> allData = new ArrayList<Data>();

	///*****constructor*****///
	public DataFrame(){
		header = Reader.readHeader();
		allData = Reader.readCsvFile();
	}

	///*****get*****///
	public String[] getHeader(){
		return header;
	}
	public ArrayList<Data> getAllData(){
		return allData;
	}

	///*****sort*****///
	public void 

	///*****print*****///
	public void printAllHeader(){
		for(int i = 0; i < header.length; i++)
			printHeaderOf(header[i]);
		System.out.println("");
	}
	public void printAllData(){
		for(int i = 0; i < allData.size(); i++){
			for(int j = 0; j < header.length; j++){
				allData.get(i).printValueOf(header[j]);
			}
			System.out.println("");
		}
	}
}

