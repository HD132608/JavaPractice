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
 * 1. ���� :
 * 2. �ۼ��� : 2015. 5. 14.
 * </pre>
 * 
 * @author : �ڵ���
 * @version : 1.0
 *
 */
public class Question {
	
	public static void main(String[] args) {
		
		System.out.println("���������ϴ� ������?");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		if( "���".equals(answer) )
		{
			System.out.println("�����Դϴ�.");
		}
		else
		{
			System.out.println("Ʋ�Ƚ��ϴ�");
		}
		System.out.println("\n");
		//---------------------------------------------------------
		System.out.println("���������ϴ� ����?");
		String answer2 = scanner.nextLine();
		if( "���μ�".equals(answer2) )
		{
			System.out.println("�����Դϴ�.");
		}
		else
		{
			System.out.println("Ʋ�Ƚ��ϴ�");
		}
		System.out.println("\n");
		//--------------------------------------------------------
		System.out.println("���������ϴ� ������?");
		String answer3 = scanner.nextLine();
		if( "�ڹ�".equals(answer3) )
		{
			System.out.println("�����Դϴ�.");
		}
		else
		{
			System.out.println("Ʋ�Ƚ��ϴ�");
		}
		
		scanner.close();
	}

}
