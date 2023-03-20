package 백준_10단계_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 백준_10단계_소트인사이드 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		String str = Integer.toString(num); // Integer 추상 클래스를 통해서 int타입을 string타입으로 바꿀수 있다.
		ArrayList list = new ArrayList();

		for (int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
		}
		Collections.sort(list, Collections.reverseOrder()); // Collection이라는 클래스를 이용하여 차순 정리를 할수있다.

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
	}

}
