package 백준_10단계_;

import java.util.*;

public class 백준_10단계_커트라인 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int person = in.nextInt();
		int award = in.nextInt();
		int i=0;
		Integer [] arr = new Integer[person];
		for(i=0; i<arr.length; i++) {
			arr[i] = in.nextInt();
		}
		// 입력값 다 받기
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(arr[award-1]);
	in.close();
	}
	
}
