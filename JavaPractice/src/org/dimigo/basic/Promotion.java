package org.dimigo.basic;

public class Promotion {
	public static void main(String[] args) {
		
		long month = 1700000;
		int man = 3;
		int jumpo = 1500;
		
		long year = (long)(month * 12 * man * jumpo);
		
		
		System.out.println("<<��̺��� ���� �ΰǺ� >>");
		System.out.println("�� ��� �޿� : " +  String.format("%,d",month));
		System.out.println("���� �� ���� �� : " + String.format("%,d",man));
		System.out.println("���� �� : " + String.format("%,d",jumpo));
		System.out.println("���� �ΰǺ� : " + String.format("%,d",year));
		
		
		
	}
}
