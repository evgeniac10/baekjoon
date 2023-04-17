package 백준;

import java.util.Scanner;

public class 백준_알파벳개수_10808번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int arr[] = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			char word = str.charAt(i);
			arr[word - 97]++;
		}
		
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]+" ");	
		}
		
	}

}
