/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * |_ Runner
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 5.
 * </pre>
 * 
 * @author : 박도혁
 * @version : 1.0
 *
 */
public class Runner extends Thread {

private String name;

public Runner(){}
public Runner(String name){
	this.name = name;
}

public void run ()
{
	int time = 1000;
	int distance = 100;
	System.out.println(name + " 출발");
	
	do
	{
		try
		{
			System.out.println(name + " " + distance + " 미터");
			distance -= 10;
			Thread.sleep(time);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	while (distance > 0);
	System.out.println(name + " 골인");
}

}