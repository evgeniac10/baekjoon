package 백준_10단계_;

import java.util.*;

public class 백준_10단계_대표값2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int arr[] = new int[5];
		int avg = 0; 
		
		for(int i=0; i<5; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		
		for(int i=0; i<5; i++) {
			avg += arr[i];
		}
		
		System.out.println(avg / arr.length);
		System.out.println(arr[2]);
		in.close();
	}

}
