/**
 * 
 */
package org.dimigo.oop;

public class PiggyBank {

	private static int balance;
	
	public static void putMoney(FamilyMember familymember, int amount)
	{
		System.out.println(familymember.getMemberName() + amount + "원 넣음");
		balance += amount;
		
	}
	public static void printBalance()
	{
		System.out.println("돼지저금통 총 금액" + balance + "원" );
	}

}
