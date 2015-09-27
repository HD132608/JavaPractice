/**
 * 
 */
package dimogo.or.exception;

/**
 * <pre>
 * dimogo.or.exception
 * |_ MovieTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 * 
 * @author : 박도혁
 * @version : 1.0
 *
 */
public class MovieTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			Movie[] movie = {
					new Movie("앤트맨",12),
					new Movie("사도",12),
					new Movie("베테랑",15)
			};
			int age = 13;
			
			for(Movie m : movie){
				buyTicket(m, age); // 여기서 예외 던짐
			}	
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

		
	}
	
	private static void buyTicket(Movie movie, int age) throws AgeCheckException
	{
		 if(movie.getLimitAge()>age)
	            throw new AgeCheckException(movie);
	        System.out.println(movie.getTitle()+" 영화 즐감하세용~~");
	}

}
