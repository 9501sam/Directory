package directory.data;

import directory.fileIO.CsvReader;
import java.util.ArrayList;

public class DataFrame extends Data{

	private String header[] = null;
	private ArrayList<String[]> table = new ArrayList<String[]>();

	public DataFrame(){
		header = CsvReader.readHeader();
		table = CsvReader.readFile();
	}

	public ArrayList<String[]> getTable(){
		return table;
	}

}

