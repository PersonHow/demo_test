package com.example.practice;


//@SpringBootApplication
public class pra_March06 {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("0123 456 ");
		if(str.length()==9)
			str.insert(9, "abced");
		    str.delete(2, 5);
		    System.out.println(str);
		    System.out.println(str.indexOf("d"));
	}

}
