/**
 * 
 */
package dimogo.or.exception;

/**
 * <pre>
 * dimogo.or.exception
 * |_ AgeCheckException
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 * 
 * @author : 박도혁
 * @version : 1.0
 *
 */
public class AgeCheckException extends Exception {

	public AgeCheckException(){}
	
	public AgeCheckException(Movie movie){
		 super(movie.getTitle() + "은/는 " + movie.getLimitAge() + "이상 관람가입니다.");
	}
	
}
