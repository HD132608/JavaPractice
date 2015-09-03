
package org.dimigo.abstractclass;

public class SmartPhoneTest {

	public static void main(String[] args) {
		
		 SmartPhone[] s = { new IPhone("IPhone6", "애플", 700000), 
				 				   new Galaxy("갤러시s6", "삼성", 650000)
		 						 };
		 
		 for(int i =0; i<2; i++){
			 System.out.println(s[i]);
			 s[i].turnOn();
			 s[i].pay();
			 s[i].useSpecialFuntion(s[i]);
			 s[i].turnOff();
			 System.out.println("");
			 System.out.println("");
		 }
		 

	}

}