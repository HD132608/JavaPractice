/**
 * 
 */
package org.dimigo.oop;

public class PiggyBankTest {

	public static void main(String[] args) {
		
		FamilyMember[] member = { 
			new FamilyMember("�ƺ�"),
			new FamilyMember("����"),
			new FamilyMember("��"),
			new FamilyMember("������")
		};
		FamilyMember.printMemberCnt();
		PiggyBank.putMoney(member[0], 10000);
		PiggyBank.putMoney(member[1], 5000);
	    PiggyBank.putMoney(member[2], 2000);
	    PiggyBank.putMoney(member[3], 1000);
	    
	    PiggyBank.printBalance();
	    
	    PiggyBank.putMoney(member[2], 1000);
		
	  
	    PiggyBank.printBalance();
		
		 
		
	}


}
