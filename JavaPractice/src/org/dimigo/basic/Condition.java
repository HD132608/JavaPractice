package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		
		String cha1 = "��ӹ���" , cha2 = "����", cha3 = "�� ��";
		
		String cha ="";
		int charge = 0;
		int ds = 0;
		
		//�� �Է�
		cha = "�� ��";
		ds = 25;
		
		switch(cha)
		{
		case "��ӹ���" :
			charge += 850;
			if(ds/10 > 0)
			{
				if(ds %10 >0)
				{
					charge += 300*(ds/10);
				}
			}
			System.out.println("<<��ӵ��� ����� ���>>");
			System.out.println("�Ÿ� : " + ds + "km");
			System.out.println("���� : " + cha1);
			System.out.println("����� : " + charge + "��");
			break;
		
		case "����" :
			charge += 300;
			if(ds/10 > 0)
			{
				if(ds %10 >0)
				{
					charge += 200*(ds/10);
				}
			}
			System.out.println("<<��ӵ��� ����� ���>>");
			System.out.println("�Ÿ� : " + ds + "km");
			System.out.println("���� : " + cha2);
			System.out.println("����� : " + charge + "��");
			break;
			
		case "�� ��" :
			charge += 600;
			if(ds/10 > 0)
			{
				if(ds %10 >0)
				{
					charge += 200*(ds/10);
				}
			}
			System.out.println("<<��ӵ��� ����� ���>>");
			System.out.println("�Ÿ� : " + ds + "km");
			System.out.println("���� : " + cha3);
			System.out.println("����� : " + charge + "��");
			break;
		}
		
		
		
		

	}

}
