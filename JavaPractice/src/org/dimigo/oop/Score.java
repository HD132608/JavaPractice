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
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 * 
 * @author : 박도혁
 * @version : 1.0
 *
 */
public class Score {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수 입력 =>");
		int kor = scanner.nextInt();
		
		System.out.println("수학 점수 입력 =>");
		int math = scanner.nextInt();
		
		System.out.println("영어 점수 입력 =>");
		int eng = scanner.nextInt();
		
		int total = kor + math + eng;
		int avr = (kor + math + eng)/3;
		
		String sb = new StringBuilder()
		.append("국어 점수 : " + kor)
		.append("수학점수 : " + math)
		.append("영어 점수 : " + eng)
		.append("총점 : " + total )
		.append("평균 : " + avr).toString();
		
		System.out.println(sb);
		
		scanner.close();
		
		
	}

}
