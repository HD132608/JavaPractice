/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * |_ Race
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 5.
 * </pre>
 * 
 * @author : 박도혁
 * @version : 1.0
 *
 */
public class Race {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread start");
		System.out.println("main thread end");
		
		Thread r1 = new Runner("메이즈");
		Thread r2 = new Runner("러너");
		
		r1.setPriority(Thread.MAX_PRIORITY);
		r2.setPriority(Thread.MIN_PRIORITY);
		
		r1.start();
		r2.start();

	}

}
