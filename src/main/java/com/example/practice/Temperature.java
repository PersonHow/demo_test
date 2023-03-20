package com.example.practice;

public class Temperature {
// 0309 練習時自建用
	private int celsius; // 攝氏
	private int fahrenheit; // 華氏

	public Temperature() {

	}

	public Temperature(int celsius, int fahrenheit) {
		this.celsius = celsius;
		this.fahrenheit = fahrenheit;
	}

	public void cTraf() {
		fahrenheit = ((celsius * 9) / 5) + 32;
		System.out.println("轉換華氏溫度：" + fahrenheit);
	}

	public void fTrac() {
		celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("轉換攝氏溫度：" + celsius);
	}

	public int getCelsius() {
		return celsius;
	}

	public void setCelsius(int celsius) {
		this.celsius = celsius;
	}

	public int getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(int fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

}
