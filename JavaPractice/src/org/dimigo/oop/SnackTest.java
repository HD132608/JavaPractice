/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_ SnackTest
 *
 * 1. ���� :
 * 2. �ۼ��� : 2015. 5. 18.
 * </pre>
 * 
 * @author : �ڵ���
 * @version : 1.0
 *
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Snack snackarr[] = {
				new Snack("�����", "���", 1100, 2),
				new Snack("��Ĩ", "ũ���", 1200, 1),
				new Snack("��Ϲ���Ĩ", "����", 1500, 4)
		};
		
		int total = 0;
		
		for(int i=0; i<3; i++)
		{
			snackarr[i].printSnack();
			total += snackarr[i].calcPrice();
		}
		
		System.out.println("�� ���� �ݾ� : " + String.format("%,d", total)+"��");
	}
}
