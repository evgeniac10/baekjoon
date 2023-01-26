package 백준_1단계;
import java.util.Scanner;
public class 백준_1단계_체스 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int L = sc.nextInt();
		int V = sc.nextInt();
		int N = sc.nextInt();
		int F = sc.nextInt();
		
		
		System.out.print( 1-K  + " ");
		System.out.print( 1-Q + " " );
		System.out.print( 2-L + " ");
		System.out.print( 2-V + " ");
		System.out.print( 2-N + " ");
		System.out.print( 8-F + " ");
		
		sc.close();
	}

}
