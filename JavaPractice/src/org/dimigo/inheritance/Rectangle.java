/**
 * 
 */
package org.dimigo.inheritance;

public class Rectangle extends Figure {

	public int weight;
	public int height;
	
	public Rectangle(int weight, int height) {
		super(0, 0);
		this.weight = weight;
		this.height = height;
	}
	
	public Rectangle(int centerX, int centerY, int weight, int height) {
		super(centerX, centerY);
		this.weight = weight;
		this.height = height;
	}
	
	protected double calcArea(){
		return weight * height; 
	}
	protected void printCenter(){
		System.out.println("사각형 중심좌표"+"("+centerX+","+centerY+")");
	};

}
