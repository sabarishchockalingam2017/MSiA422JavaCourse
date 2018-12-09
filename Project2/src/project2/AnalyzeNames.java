package project2;

import java.io.File;

public class AnalyzeNames {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		MyPandas pd = new MyPandas();
		String filepath = "."+File.separator+"namesbystate"+File.separator+"AK.txt";
		MyDataFrame namedf = pd.readCSV(filepath,false);
		
		System.out.println(namedf);
		
	}

}
