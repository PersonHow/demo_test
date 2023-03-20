package com.example.homework;

public class ClassE extends ClassC {
	String famliyNum ;
	String homeTown;
	
	public ClassE() {
		
	}
	
	public ClassE(String famliyNum, String homeTown) {
		this.famliyNum = famliyNum;
		this.homeTown = homeTown;
	}

	public String getFamliyNum() {
		return famliyNum;
	}

	public void setFamliyNum(String famliyNum) {
		this.famliyNum = famliyNum;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	
	
}
