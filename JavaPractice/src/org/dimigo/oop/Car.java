/**
 * 
 */
package org.dimigo.oop;

public class Car {
private String company;
private String model;
private String color;
private int maxspeed;
private int price;

//�������
public void setCompany(String  newCompany){
	company = newCompany;
}
public String getCompany(){
		return company;
}

//�𵨸�
public void setModel(String  newModel){
	model = newModel;
}
public String getModel(){
	return model;
}

//����
public void setColor(String  newColor){
	color = newColor;
}
public String getColor(){
	return color;
}

//�ִ�ӵ�
public void setMaxSpeed(int  newMaxSpeed){
	maxspeed = newMaxSpeed;
}
public int getMaxSpeed(){
	return maxspeed;
}

//����
public void setPrice(int  newPrice){
	price = newPrice;
}
public int getPrice(){ 
	return price;
}
}
