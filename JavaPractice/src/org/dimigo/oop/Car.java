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

//제조사명
public void setCompany(String  newCompany){
	company = newCompany;
}
public String getCompany(){
		return company;
}

//모델명
public void setModel(String  newModel){
	model = newModel;
}
public String getModel(){
	return model;
}

//색상
public void setColor(String  newColor){
	color = newColor;
}
public String getColor(){
	return color;
}

//최대속도
public void setMaxSpeed(int  newMaxSpeed){
	maxspeed = newMaxSpeed;
}
public int getMaxSpeed(){
	return maxspeed;
}

//가격
public void setPrice(int  newPrice){
	price = newPrice;
}
public int getPrice(){ 
	return price;
}
}
