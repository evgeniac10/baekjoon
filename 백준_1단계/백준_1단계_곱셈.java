package 백준_1단계;
import java.util.Scanner;
public class 백준_1단계_곱셈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = (b%10)* a ;
		int d = ((b%100)-(b%10))* a;
		int e = (b/100)*a;
		
		System.out.println (c) ;
		System.out.println (d/10);
		System.out.println (e);
		System.out.println (c + d + e *100);
		sc.close();
	}

}
