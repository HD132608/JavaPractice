/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_ IdolGroup
 *
 * 1. ���� :
 * 2. �ۼ��� : 2015. 5. 28.
 * </pre>
 * 
 * @author : �ڵ���
 * @version : 1.0
 *
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] group = new String[] {
				"���",
				"2NE1",
				"�ɽ�����"
		};
		
		String[][] members = {
				new String[] {"GD", "�¾�", "�뼺", "ž", "�¸�"},
				new String[] {"CL", "��ٶ��", "�ں�", "����"},
				new String[] {"����", "����", "����", "�ξ�"}
		};
		
		for (int i=0; i<group.length; i++)
		{
			System.out.println("<<" + group[i] + " ��� >>");
			for(int j=0; j<members[i].length; j++)
			{
				System.out.println(members[i][j]);
			}
			System.out.println();
		}
	}

}
