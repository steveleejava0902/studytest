package kuyt1819;

import java.util.HashMap;

public class Singer extends Person {
	private String major;
	private String titlesong;

	public Singer() {
		// TODO Auto-generated constructor stub
	}
	//d
	public Singer(String name, int age, String major, String titlesong) {
		this.name = name;
		this.age = age;
		this.major = major;
		this.titlesong = titlesong;
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
