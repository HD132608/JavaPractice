package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		
		int a = 9, b= 10;
		double h = 5.8;
		
		double s1 = (a+b)*h/2 ;
		
		h = 5.4;
		
		double s2 = a*h;
		
		
		System.out.println("<<���� ���� ��>>");
		System.out.println("��ٸ��� ���� : " + s1);d
		System.out.println("����纯�� ���� : " + s2);
		if(s1 > s2)
			System.out.println("��ٸ����� ����纯������ " + (s1 - s2)+ " �� Ů�ϴ�" );
		else
			System.out.println("����纯���� ��ٸ��ú��� " + (s2 - s1)+ " �� Ů�ϴ�" );
			
		
		

	}

}
