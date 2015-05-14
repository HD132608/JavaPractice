/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * |_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 * 
 * @author : 박도혁
 * @version : 1.0
 *
 */
public class Question {
	
	public static void main(String[] args) {
		
		System.out.println("가장좋아하는 가수는?");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		if( "빅뱅".equals(answer) )
		{
			System.out.println("정답입니다.");
		}
		else
		{
			System.out.println("틀렸습니다");
		}
		System.out.println("\n");
		//---------------------------------------------------------
		System.out.println("가장좋아하는 배우는?");
		String answer2 = scanner.nextLine();
		if( "조인성".equals(answer2) )
		{
			System.out.println("정답입니다.");
		}
		else
		{
			System.out.println("틀렸습니다");
		}
		System.out.println("\n");
		//--------------------------------------------------------
		System.out.println("가장좋아하는 과목은?");
		String answer3 = scanner.nextLine();
		if( "자바".equals(answer3) )
		{
			System.out.println("정답입니다.");
		}
		else
		{
			System.out.println("틀렸습니다");
		}
		
		scanner.close();
	}

}
