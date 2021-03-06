/**
 * 
 */
package dimigo.or.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * dimigo.or.collection
 * |_ MelonCenreChart
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 10. 1.
 * </pre>
 * 
 * @author : 박도혁
 * @version : 1.0
 *
 */
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 발라드
		List<Music> ballad = new ArrayList<Music>();
		ballad.add(new Music("내 첫사랑", "베리굿"));
		ballad.add(new Music("또 다시 사랑", "임창정"));
		ballad.add(new Music("부산에 가면", "박진영"));
		// 댄스
		List<Music> dance = new ArrayList<Music>();
		dance.add(new Music("커피", "유재현, 김예림"));
		dance.add(new Music("다 잘될거야", "쿨"));
		//맵 생성
		Map<String,List<Music>> map = new HashMap<String, List<Music>>();
		map.put("발라드", ballad);
		map.put("댄스", dance);
		
		System.out.println("<<멜론 장르별 차트>>");
		printMap(map);
		System.out.println("<<발라드 3위곡 변경>>");
//		map.replace(key, oldValue, newValue)
		ballad.set( 2, new Music("지우고 지워도", "차수경"));
		printMap(map);
		System.out.println("<<발라드 1위곡 삭제>>");
		ballad.remove(0);
		printMap(map);
		System.out.println("<<전체 리스트 삭제>>");
		map.clear();
		printMap(map);
		
		
		
		
	}
	
public static void printMap(Map<String, List<Music>>map){
		for(String key : map.keySet())
		{
			System.out.println("["+key+"]");
			int rank=1;
			for(Music music : map.get(key))
			{
				System.out.println(rank +". "+ music.toString());
				rank ++;
			}
		}
	}

}
