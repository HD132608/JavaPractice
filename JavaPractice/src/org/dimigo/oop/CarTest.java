/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_ CarTest
 *
 * 1. ���� :
 * 2. �ۼ��� : 2015. 4. 13.
 * </pre>
 * 
 * @author : �ڵ���
 * @version : 1.0
 *
 */
public class CarTest {

	public static void main(String[] args) {
		Car3 car1 = new Car3("�����ڵ���", "���׽ý�", "������", 225, 50000000);
		Car3 car2 = new Car3("����ڵ���", "K7", "���", 246);
		Car3 car3 = new Car3("�Ｚ�ڵ���", "SM7", "ȸ��");
		//1
		System.out.println("������� : " +car1.getCompany());
		System.out.println("�𵨸� : " + car1.getModel());
		System.out.println("���� : " + car1.getColor());
		System.out.println("�ִ�ӵ� : " + car1.getMaxSpeed() + "km");
		System.out.println("���� : " + String.format("%,d",car1.getPrice()) + "��");
		//2
		System.out.println("������� : " +car2.getCompany());
		System.out.println("�𵨸� : " + car2.getModel());
		System.out.println("���� : " + car2.getColor());
		System.out.println("�ִ�ӵ� : " + car2.getMaxSpeed() + "km");
		System.out.println("���� : " + String.format("%,d",car2.getPrice()) + "��");
		//3
		System.out.println("������� : " +car3.getCompany());
		System.out.println("�𵨸� : " + car3.getModel());
		System.out.println("���� : " + car3.getColor());
		System.out.println("�ִ�ӵ� : " + car3.getMaxSpeed() + "km");
		System.out.println("���� : " + String.format("%,d",car3.getPrice()) + "��");
	}
}
