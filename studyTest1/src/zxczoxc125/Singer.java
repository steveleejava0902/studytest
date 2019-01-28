package zxczoxc125;

import java.util.HashMap;
import java.util.Map;

public class Singer extends Person {
	private String major;
	private String titlesong;
	
	Map<String, String> famousSongs = new HashMap<>();
	
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
}
