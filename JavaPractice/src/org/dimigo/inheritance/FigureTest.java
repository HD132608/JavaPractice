/**
 * 
 */
package org.dimigo.inheritance;


public class FigureTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Circle c = new Circle(5);
		Triangle t = new Triangle(10, 10, 5, 8);
		Rectangle r = new Rectangle(20, 20, 5, 8);
		
		System.out.println(String.format("%.1f", c.calcArea()));
		System.out.println(String.format("%.1f", t.calcArea()));
		System.out.println(String.format("%.1f", r.calcArea()));
		
		c.printCenter();
		t.printCenter();
		r.printCenter();
		//좌표 각각 5씩 이동
		c.moveFigure(5, 5);
		t.moveFigure(5, 5);
		r.moveFigure(5, 5);
		
		c.printCenter();
		t.printCenter();
		r.printCenter();		
		
		

	}

}
