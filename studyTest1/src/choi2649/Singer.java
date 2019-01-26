package choi2649;

import java.util.HashMap;

public class Singer extends Person{
	
	private String major;
	private String titlesong;

	
	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public String getTitlesong() {
		return titlesong;
	}


	public void setTitlesong(String titlesong) {
		this.titlesong = titlesong;
	}


	HashMap<String,String> a = new HashMap<String,String>();
	
	
}
