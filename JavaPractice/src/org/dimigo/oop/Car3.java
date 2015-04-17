/**
 * 
 */
package org.dimigo.oop;

public class Car3 {
private String company;
private String model;
private String color;
private int maxspeed;
private int price;

public Car3() {}

public Car3(String company, String model, String color, int maxspeed, int price){
	this.company = company;
	this.model= model;
	this.color = color;
	this.maxspeed = maxspeed;
	this.price = price;
}

public Car3(String company, String model, String color, int maxspeed) {
	this(company, model, color, maxspeed,0);
}

public Car3(String company, String model, String color) {
	this(company, model, color, 0);
}

//�������
//public void setCompany(String  newCompany){
//	company = newCompany;
//}
public String getCompany(){
		return company;
}

//�𵨸�
//public void setModel(String  newModel){
//	model = newModel;
//}
public String getModel(){
	return model;
}

//����
//public void setColor(String  newColor){
//	color = newColor;
//}
public String getColor(){
	return color;
}

//�ִ�ӵ�
//public void setMaxSpeed(int  newMaxSpeed){
//	maxspeed = newMaxSpeed;
//}
public int getMaxSpeed(){
	return maxspeed;
}

//����
//public void setPrice(int  newPrice){
//	price = newPrice;
//}
public int getPrice(){ 
	return price;
}
}
