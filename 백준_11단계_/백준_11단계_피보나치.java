package 백준_11단계_;

import java.util.Scanner;
public class 백준_11단계_피보나치 {

	public static int fibonacci(int num) {
		if(num == 0 ) { return 0 ;}
		if(num == 1 ) { return 1 ;}
		return fibonacci(num - 2) + fibonacci(num - 1);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(fibonacci(sc.nextInt()));
	}
}