package com.example.homework;

public class ClassC {

	private String city = "city";
	private String state = "state";
	private String conutry = "conutry";
	private String famliy;

	public ClassC() {

	}

	public ClassC(String city, String state, String conutry, String famliy) {
		this.city = city;
		this.state = state;
		this.conutry = conutry;
		this.famliy = famliy;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getConutry() {
		return conutry;
	}

	public void setConutry(String conutry) {
		this.conutry = conutry;
	}

	
	public String getFamliy() {
		return famliy;
	}

	public void setFamliy(String famliy) {
		this.famliy = famliy;
	}
}
