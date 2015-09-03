/**
 * 
 */
package org.dimigo.abstractclass;

public abstract class SmartPhone {
	
	public String company;
	public String model;
	public int price;

	public SmartPhone(){}
	
	public SmartPhone(String model, String company, int price) {
		this.company = company;
		this.model = model;
		this.price = price;
	}
	
	public void turnOn()
	{
		System.out.println(this.model + "의 전원을 킵니다.");
	}
	public void turnOff()
	{
		System.out.println(this.model + "의 전원을 끕니다.");
	}
	public abstract void pay();
	
	public void useSpecialFuntion(SmartPhone s)
	{
		if(s == null)
		{
			return;
		}
		else if(s instanceof IPhone){
			IPhone a = (IPhone) s;
			a.useAirDrop();
		}
		else{
			Galaxy a = (Galaxy) s;
			a.WirelessCharging();
		}
	}
	@Override
	public String toString() {
		return "모델명 : " + model + ", 제조사 : " + company + ", 가격 : "
				+ price + "원";
	}
	

}
