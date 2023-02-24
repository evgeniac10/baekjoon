package 백준_10단계_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class 백준_10단계_통계학 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>(); // 입력받은 수를 배열로 나열
		ArrayList<Integer> list2 = new ArrayList<>(); // 맵의 벨류를 다시 배열로 나열
		ArrayList<Integer> list3 = new ArrayList<>(); //
		HashMap<Integer, Integer> map = new HashMap<>();

		double avg = 0;
		int cen = 0;
		int fre = 0;
		int range = 0;
		int count = 0; // 해당 키 값의 벨류 추가 해주는 변수

		for (int i = 0; i < T; i++) {// list 배열에 값들을 넣기
			list.add(sc.nextInt());
			avg += (double) list.get(i);
		}
		Collections.sort(list); // 배열 오름차순으로 정리

		for (int i = 0; i < T; i++) {
			if (map.containsKey(list.get(i))) {
				map.put(list.get(i), map.get(list.get(i)) + 1);
			} else {
				map.put(list.get(i), 1);
			}
		}

		for (int value : map.values()) {
			list2.add(value);
		}
		Collections.sort(list2, Collections.reverseOrder()); // 벨류 값을 내림차순으로 정리
		// 내림차순으로 정리한 리스트2 값이 1보다 크면 리스트3에 담기
		// 만약에 있다면 그 해당 키값을 리스트3에 넣어서 오름차순으로 정렬하고 인덱스가 1인 키값을 뽑아내야지

		for (int i = 1; i < list2.size(); i++) {
			if (list2.get(0) == list2.get(i)) {
				count++;
			}
		}
	
		if (count == 0) {
			for (Integer key : map.keySet()) {
				if (map.get(key).equals(list2.get(0))) {
					fre = key;
				}
			}
		} else {// 카운트가 0이 아닌경우
			for (Integer key : map.keySet()) {
				if (map.get(key).equals(list2.get(0))) {
					list3.add(key);
				}
			}
			Collections.sort(list3);
			fre = list3.get(1);
		}
		
//		System.out.println(list3);
//		System.out.println(avg/T);
		
		avg = Math.round((avg / T));
		cen = list.get((list.size() / 2));
		range = (list.get(T - 1) - list.get(0));

		System.out.println((int) avg);
		System.out.println(cen);
		System.out.println(fre);
		System.out.println(range);

		sc.close();
	}
}
