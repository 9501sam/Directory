package directory.data;

import directory.fileIO.CsvReader;
import directory.functions.user.*;
import java.util.ArrayList;

public class DataFrame extends Data{

	private String header[] = null;
	private ArrayList<String[]> table = new ArrayList<String[]>();
	private ArrayList<Data> allData = new ArrayList<Data>();

	public DataFrame(){
		header = CsvReader.readHeader();
		allData = CsvReader.readFile();
	}

	public String[] getHeader(){
		return header;
	}
	public ArrayList<Data> getAllData(){
		return allData;
	}

	public void printAllData(){
		UserFunction.printAllData(this);
	}

}

