//https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
package directory.data;

import java.util.ArrayList;

import directory.fileIO.Reader;
//import directory.data.sort.DataFrameSort;

public class DataFrame extends Data {

	///*****data member*****///
	private String header[] = null;
	private ArrayList<Data> allData = new ArrayList<Data>();
	private String sortAttri = "";
	private boolean gt = true;

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
	//@Override
	//public boolean compareTo(Data cmpData){
	//	return true;
	//}

	//public void sort(int l, int r, String key, int increase){
	//	if(l < r){
	//		int m = (l + r) / 2;

	//		sort(l, m, key, increase);
	//		sort(m+1, r, key, increase);

	//		merge(l, m, r, key, increase);
	//	}
	//} 

	//public void sortBy(String key, boolean increase){
	//	if(increase)
	//		sort(0, allData.size()-1, key, -1);
	//	else
	//		sort(0, allData.size()-1, key, 1);
	//}

	///*****print*****///
	//header
	//public void printAHeader(String key){
	//	printAHeader(key);
	//}
	public void printAllHeader(){
		for(int i = 0; i < header.length; i++)
			printAHeader(header[i]);
		System.out.println("");
	}
	//data
	public void printACell(String key, int i){
		allData.get(i).printValueOf(key);
	}
	public void printAData(int n){ // nth row
		for(int i = 0; i < header.length; i++)
			printACell(header[i], n);
		System.out.println("");
	}
	public void printAllData(){
		for(int i = 0; i < allData.size(); i++){
			printAData(i);
		}
	}

}

