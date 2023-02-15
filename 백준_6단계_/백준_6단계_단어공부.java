package 백준_6단계_;

import java.util.Scanner;

public class 백준_6단계_단어공부 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		str = str.toUpperCase();
		int arr[] = new int[26];
		int max = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (64 < str.charAt(i) && str.charAt(i) < 91) {
				arr[i] = str.charAt(i) ;
			} 
		}
		for(int j=0; j<arr.length; j++) {
			if(arr[j] > max) {
				max = arr[j];
			}
		}

		System.out.println((char)max);
	}

}
