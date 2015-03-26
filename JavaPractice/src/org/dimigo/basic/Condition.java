package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		
		String cha1 = "고속버스" , cha2 = "경차", cha3 = "그 외";
		
		String cha ="";
		int charge = 0;
		int ds = 0;
		
		//값 입력
		cha = "그 외";
		ds = 25;
		
		switch(cha)
		{
		case "고속버스" :
			charge += 850;
			if(ds/10 > 0)
			{
				if(ds %10 >0)
				{
					charge += 300*(ds/10);
				}
			}
			System.out.println("<<고속도로 통행료 계산>>");
			System.out.println("거리 : " + ds + "km");
			System.out.println("차종 : " + cha1);
			System.out.println("통행료 : " + charge + "원");
			break;
		
		case "경차" :
			charge += 300;
			if(ds/10 > 0)
			{
				if(ds %10 >0)
				{
					charge += 200*(ds/10);
				}
			}
			System.out.println("<<고속도로 통행료 계산>>");
			System.out.println("거리 : " + ds + "km");
			System.out.println("차종 : " + cha2);
			System.out.println("통행료 : " + charge + "원");
			break;
			
		case "그 외" :
			charge += 600;
			if(ds/10 > 0)
			{
				if(ds %10 >0)
				{
					charge += 200*(ds/10);
				}
			}
			System.out.println("<<고속도로 통행료 계산>>");
			System.out.println("거리 : " + ds + "km");
			System.out.println("차종 : " + cha3);
			System.out.println("통행료 : " + charge + "원");
			break;
		}
		
		
		
		

	}

}
