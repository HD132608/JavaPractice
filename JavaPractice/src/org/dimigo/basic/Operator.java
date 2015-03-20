package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		
		int a = 9, b= 10;
		double h = 5.8;
		
		double s1 = (a+b)*h/2 ;
		
		h = 5.4;
		
		double s2 = a*h;
		double cha = s1 - s2;
		
		
		System.out.println("<<도형 넓이 비교>>");
		System.out.println("사다리꼴 넓이 : " + s1);
		System.out.println("평행사변형 넓이 : " + s2);
		System.out.println("사다리꼴이 평행사변형보다 " + cha + " 더 큽니다" );
		
		

	}

}
