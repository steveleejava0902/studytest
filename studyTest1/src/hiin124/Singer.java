package hiin124;

import java.util.Map;

public class Singer extends Person{

	String major;
	String titlesong;
	
	Map<String, String> famousSongs;
	//수정중..
	//..
	//ss
	void setFamousSongs('a','b');
	
	public Map<String, String> getFamousSongs() {
		return famousSongs;
	}
	public void setFamousSongs(Map<String, String> famousSongs) {
		this.famousSongs = famousSongs;
	}
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
