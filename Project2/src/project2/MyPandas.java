package project2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyPandas {

	// function to read in csv and output dataframe
	// parameters include csv file and boolean to confirm header or no header is included
	public MyDataFrame readCSV(String path, boolean header) throws Exception {
		
		MyDataFrame tempdf = null;
		BufferedReader bufferedReader = null;
		
		// lists to create dataframe
		List<String> headers = new ArrayList<>();
		List<String> state = new ArrayList<>();
		List<String> gender = new ArrayList<>();
		List<Integer> year = new ArrayList<>();
		List<String> name = new ArrayList<>();
		List<Integer> count = new ArrayList<>();


		
		try {
			bufferedReader = new BufferedReader(new FileReader(path));
			// if there is a header, skip first line

			if(header) {
				headers=Arrays.asList(bufferedReader.readLine().split(","));
			}
			String line;
			String[] splitline;
			
			while((line=bufferedReader.readLine())!=null) {
				splitline = line.split(",");
				state.add(splitline[0]);
				gender.add(splitline[1]);
				year.add(Integer.parseInt(splitline[2]));
				name.add(splitline[3]);
				count.add(Integer.parseInt(splitline[4]));
			}
			headers.add("State");
			headers.add("Gender");
			headers.add("Year");
			headers.add("Name");
			headers.add("Count");
			tempdf = new MyDataFrame(headers,state,gender,year,name,count);

			
		}catch(Exception e) {
			System.out.println("File invalid");
			throw e;
		}
		
		return tempdf;
	}
	
public static void writeCSV(String path, MyDataFrame DF) throws Exception {
		
		BufferedWriter bufferedWriter = null;
		
		// lists to create dataframe
		List<String> writes = new ArrayList<>();
		
		
		try {
			bufferedWriter = new BufferedWriter(new FileReader(path));
			// if there is a header, skip first line

	
			headers=Arrays.asList("%s|%s|%s|%s|%s","State","Gender","Year","Name","Count");
			BufferedWriter.write(headers);
			
			for(MyDataFrame i:DF) {
				
			}
			String line;
			String[] splitline;
			
			while((line=bufferedReader.readLine())!=null) {
				splitline = line.split(",");
				state.add(splitline[0]);
				gender.add(splitline[1]);
				year.add(Integer.parseInt(splitline[2]));
				name.add(splitline[3]);
				count.add(Integer.parseInt(splitline[4]));
			}
			headers.add("State");
			headers.add("Gender");
			headers.add("Year");
			headers.add("Name");
			headers.add("Count");
			tempdf = new MyDataFrame(headers,state,gender,year,name,count);

			
		}catch(Exception e) {
			System.out.println("File invalid");
			throw e;
		}
		
	}
	
}
