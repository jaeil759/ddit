package h_collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayListClass {
	/*
	 *  boolean add(Object o) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
	 *  void add(int index, Object o) : 지정된 위치에 객체를 추가한다.
	 *  Object set(int i, Object o) : 지정된 위치에 객체를 저장 한 후 기존 객체를 반환한다.
	 *  Object get(int i, Object o) : 지정된 위치의 객체를 반환한다.
	 *  int size() : 저장된 객체의 수를 반환한다,
	 *  boolean remove(int i) : 지정된 위치의 객체를 제거한다.
	 *  
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		// list : a(), b();
		//ArrayList : a(), b(), c();
//		ArrayList list : new List();
//		list.c();
		
		
		list.add("abc");
		list.add(100);
		list.add(new Scanner(System.in));
		
		//제네릭을 지정하지 않으면 넣을때는 편하나 꺼낼때는 탕비을 예측하기 어럽다.
		// 따라서 제네릭의 사용이 권장한다.
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
//		list2.add("abc");
		System.out.println(list2.add(20));
		System.out.println(list2.add(20));
		System.out.println(list2);
		
		list2.add(1,40);  // 1번인덱스부터 뒤로 밀고 값을 저장한다
		System.out.println(list2);
		
//		list2.add(7,50); //순서대로만 저장할수 있다
		int before = list2.set(2, 50); // 2번인덱스에 값을 저장하고 기존값을 반환한다.
		System.out.println("before : " + before);
		System.out.println("after : " + list2.get(2)); // 배열 :  list[2]
		
		// 값을 제거 할때는 반드시 뒤에서부터 제거해야 한다.
//		for(int i = 0; i <list2.size(); i++) {
//			System.out.println(i + " : " + list2.get(i));
//			list2.remove(i);
//		}
		for(int i = list2.size() -1; i>=0; i--) {
			System.out.println(i + " : " + list2.get(i));
			list2.remove(i);
		}
		// 예제) list3에 1부터 100까지 랜덤값을 10개 저장해주세요.
		List<Integer> list3 = new ArrayList<>(); // 선언할때 제네릭을 적으면 생성자에서는 생략이 가능
// 방법1
//		for(int i = 0; i < 10; i++) {
//			list3.add(new Random().nextInt(100) +1 );
//		}
		for(int i = 0; i < 10; i++) {
			list3.add(i, new Random().nextInt(100) + 1);
		}
		System.out.println(list3);
		//예제2) list3 에 저장된 값의 합계와 평균을 구해주세요.
		int sum = 0;
		double avg = 0;
		for(int item : list3) {
			sum += item;
		}
		avg = sum * 1.0 / list3.size();
		System.out.println("sum : " + sum + ", avg : " + avg);
		
		//예제3 list3 에서 최솟값과 최댓값을 구해주세요.
		int min = list3.get(0);
		int max = list3.get(0);
		for(int i = 0; i< list3.size(); i++) {
			if(list3.get(i) < min) {
				min = list3.get(i);
			}
			if(list3.get(i) > max) {
				max = list3.get(i);
			}
		}
		System.out.println("min : " + min + ", max : " + max);
		
		//예제4) list3을 오름차순으로 정렬해주세요
		for(int i = 1; i < list3.size(); i++) {
			int tmp = list3.get(i);
			int j = 0;
			for(j = i - 1; j >=0; j--) {
				if(tmp < list3.get(j)) {
					list3.set(j+1,list3.get(j));
				}else {
					break;
				}
			}
				list3.set(j+1, tmp);
			}
		System.out.println(list3);
		
		//2차원
		List<List<Integer>> list4 = new ArrayList<>();
		//3차원
		List<List<List<Integer>>> list5 = new ArrayList<>();
		
		list3 = new ArrayList<Integer>();
		list3.add(1);
		list3.add(2);
		list3.add(3);
		
		list4.add(list3);
		
		List<Integer> list6 = new ArrayList<>();
		list6.add(4);
		list6.add(5);
		list6.add(6);
		list4.add(list6);
		System.out.println(list4);
		
		//list = new ArrayList<Object>();
		list.remove(2);
		list.add("홍길동");
		list.add(50);
		list.add(60);
		System.out.println(list);
		
		String name = (String)list.get(2);
		name.charAt(0);
		
		list.addAll(list6);
		System.out.println(list);
		
		UserList<Object> ul = new UserList<>(); 
		ul.addAll(list);
		System.out.println(ul);
		}
	}
	


