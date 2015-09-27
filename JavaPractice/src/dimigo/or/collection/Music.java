/**
 * 
 */
package dimigo.or.collection;

/**
 * <pre>
 * dimigo.or.collection
 * |_ Music
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 24.
 * </pre>
 * 
 * @author : 박도혁
 * @version : 1.0
 *
 */
public class Music {
	
	private String titlel;
	private String singer;
	
	public Music(String title, String singer)
	{
		this.titlel = title;
		this.singer = singer;
	}

	/**
	 * @return the titlel
	 */
	public String getTitlel() {
		return titlel;
	}

	/**
	 * @param titlel the titlel to set
	 */
	public void setTitlel(String titlel) {
		this.titlel = titlel;
	}

	/**
	 * @return the singer
	 */
	public String getSinger() {
		return singer;
	}

	/**
	 * @param singer the singer to set
	 */
	public void setSinger(String singer) {
		this.singer = singer;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Music [titlel=" + titlel + ", singer=" + singer + "]";
	}
	
	
	
}
