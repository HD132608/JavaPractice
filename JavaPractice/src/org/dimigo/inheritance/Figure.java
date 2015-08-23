/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * |_ Figure
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 17.
 * </pre>
 * 
 * @author : 박도혁
 * @version : 1.0
 *
 */
public class Figure {

	public int centerX ;
	public int centerY;

	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	/**
	 * @param centerX2
	 * @param centerY2
	 */

	protected double calcArea(){
		return 0;
	};
	protected void printCenter(){
		System.out.println("중심좌표"+"("+centerX+","+centerY+")");
	};
	protected void moveFigure(int X, int Y){
		this.centerX += X;
		this.centerY += Y;
		
	};
}
