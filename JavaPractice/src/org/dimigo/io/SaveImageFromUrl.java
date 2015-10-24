/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 * |_ SaveImageFromUrl
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 10. 23.
 * </pre>
 * 
 * @author : 박도혁
 * @version : 1.0
 *
 */
public class SaveImageFromUrl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String imageUrl = "https://static.dimigo.in/img/logobeta.png";
		try{
			URL url = new URL(imageUrl);	
			
			try(InputStream is = url.openStream();
					OutputStream os = new FileOutputStream("files/logo.png")){
				//파일 읽기
				byte[] buf = new byte[100];
				int result;
				
				while((result = is.read(buf)) != -1)
				{
					os.write(buf, 0, result);
				}
				System.out.println("파일");
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
