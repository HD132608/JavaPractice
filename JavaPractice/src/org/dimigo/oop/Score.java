/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * |_ Score
 *
 * 1. ���� :
 * 2. �ۼ��� : 2015. 5. 14.
 * </pre>
 * 
 * @author : �ڵ���
 * @version : 1.0
 *
 */
public class Score {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� ���� �Է� =>");
		int kor = scanner.nextInt();
		
		System.out.println("���� ���� �Է� =>");
		int math = scanner.nextInt();
		
		System.out.println("���� ���� �Է� =>");
		int eng = scanner.nextInt();
		
		int total = kor + math + eng;
		int avr = (kor + math + eng)/3;
		
		String sb = new StringBuilder()
		.append("���� ���� : " + kor)
		.append("�������� : " + math)
		.append("���� ���� : " + eng)
		.append("���� : " + total )
		.append("��� : " + avr).toString();
		
		System.out.println(sb);
		
		scanner.close();
		
		
	}

}
