package project2;

import java.util.ArrayList;
import java.util.List;

public class MyDataFrame {
	List<String> headers = null;
	List<String> state = null;
	List<String> gender = null;
	List<Integer> year = null;
	List<String> name = null;
	List<Integer> count = null;
	
	List<List<?>> alllists = new ArrayList<>();
	
	public MyDataFrame(List<String> hdrs, List<String> stt, List<String> gndr, List<Integer> yr, List<String> nm, List<Integer> cnt) {
		state = stt;
		gender = gndr;
		year = yr;
		name = nm;
		count = cnt;
		alllists.add(hdrs);
		alllists.add(stt);
		alllists.add(gndr);
		alllists.add(yr);
		alllists.add(nm);
		alllists.add(cnt);
		
	}
	
	public void setheader(List<String> hdrs) {
		headers = hdrs;
	}
	
	public String toString() {
		String fullstr="";
		for(int h=0; h<alllists.get(0).size();h++) {
			fullstr=fullstr+alllists.get(0).get(h)+"\t";
		}
		fullstr = fullstr+"\n";
		System.out.println();
		for(int i=0;i<state.size();i++) {
			fullstr = fullstr+state.get(i)+"\t"+gender.get(i)+"\t"+String.valueOf(year.get(i))+"\t"+name.get(i)+"\t"+String.valueOf(count.get(i))+"\n";
		}
		
		return fullstr;
	}

}
