package org.dimigo.basic;

public class Promotion {
	public static void main(String[] args) {
		
		long month = 1700000;
		int man = 3;
		int jumpo = 1500;
		
		long year = (long)(month * 12 * man * jumpo);
		
		
		System.out.println("<<디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " +  String.format("%,d",month));
		System.out.println("점포 내 직원 수 : " + String.format("%,d",man));
		System.out.println("점포 수 : " + String.format("%,d",jumpo));
		System.out.println("연간 인건비 : " + String.format("%,d",year));
		
		
		
	}
}
