/**
 * 
 */
package org.dimigo.oop;

public class PiggyBank {

	private static int balance;
	
	public static void putMoney(FamilyMember familymember, int amount)
	{
		System.out.println(familymember.getMemberName() + amount + "�� ����");
		balance += amount;
		
	}
	public static void printBalance()
	{
		System.out.println("���������� �� �ݾ�" + balance + "��" );
	}

}
