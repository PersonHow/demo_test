package com.example.practice;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

//@SpringBootApplication
public class pra_March20 {

	public static void main(String[] args) {
		String skyDra = "明教教主張無忌是武當的弟子，但明教的教徒不允許他回武當，要求掌管明教";
		String key = "明教";
		int numIndex = 0, count = 0;
		for (;;) {
			numIndex = skyDra.indexOf("明教", numIndex);
			if (numIndex == -1) {  							//超過會顯示 -1
				System.out.println("出現 "+count+" 次");
				break;
			}
			System.out.println(numIndex);
			numIndex += key.length();
			count++;
		}

	}

}
