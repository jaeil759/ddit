package h_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapClass {

	/*
	 *  Map : key => value
	 *  
	 *  Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
	 *  Object remove(Object key) : 지정된 키로 저장된 값을 제거한다.
	 *  Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
	 *  Set keySet() : 저장된 모든 키를 Set으로 반환한다.
	 */
	
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		
		map.put("a", 10);
		map.put("b", "홍길동");
		map.put("c", new Date());
		System.out.println(map);
		//[] : 배열이나 List : 순서가 있음
		//{} : Map : 순서가 없다

		map.put("b", "이순신"); // 값을 덮어쓴다
		System.out.println(map); 
		
		map.remove("a");
		System.out.println(map);
		
		Object value = map.get("b");
		System.out.println(value);
		
		
		
		//일반적인 for문으로 반복할 수 없다.
		for(int i = 0; i < map.size(); i++) {
			System.out.println(map.get(i));
		}
		
		//Set
		// 1.중복없음 2. 순서없음
		Set<String> keySet = map.keySet(); //map의 목차를 만들어줌
		for(String key : keySet) {
			System.out.println(key + " : " + map.get(key));
			
		}
		//회원테이블
		Map<String, String> user = new HashMap<>();
		user.put("id", "admin");
		user.put("password", "1234");
		user.put("name", "홍길동");
		user.put("phone", "010-0000-0000");
		
		Set<String> keys = user.keySet();
		for(String key : keys) {
			System.out.println(key + " : " + user.get(key));
			
		}
		// 회원 1명의 데이터가 담긴 HashMap을 하나 더 만드세요
		Map<String, String> user1 = new HashMap<>();
		user1.put("id", "IU");
		user1.put("name", "이지은");
		user1.put("phone", "나도알고싶다");
		user1.put("특징", "노래잘함,이쁨,완벽그자체");
		
		// 유저목록을 만들고 싶다.
		List <Map<String, String>> userList = new ArrayList();
			userList.add(user);
			userList.add(user1);
			userList.add(user1);
			userList.add(user1);
			System.out.println(userList);
			userList.get(0).get("name");
			System.out.println();
			System.out.println();
			
			// 실제 DB연동시 사용방법
			// List<Map<String,String>>.get(index).get(key)
			
			Map<String, List<Map<String,String>>> classMap = new HashMap<>();
			classMap.put("404", userList);
			System.out.println(classMap);
		}
		
		
	}


