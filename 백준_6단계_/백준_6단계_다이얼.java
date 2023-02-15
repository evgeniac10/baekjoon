package 백준_6단계_;
import java.util.Scanner;
public class 백준_6단계_다이얼 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		char arr[] = new char[in.length()];
		int sum =0;
		for (int i = 0; i < in.length(); i++) {
			arr[i] = in.charAt(i);
		}
		for (int i = 0; i < in.length(); i++) {
			if(65<=arr[i]&&arr[i]<=67) {
				int number = 3;
				sum = sum + number;
			}
			else if(68<=arr[i]&&arr[i]<=70) {
				int number = 4;
				sum = sum + number;
			}
			else if(71<=arr[i]&&arr[i]<=73) {
				int number = 5;
				sum = sum + number;
			}
			else if(74<=arr[i]&&arr[i]<=76) {
				int number = 6;
				sum = sum + number;
			}
			else if(77<=arr[i]&&arr[i]<=79) {
				int number = 7;
				sum = sum + number;
			}
			else if(80<=arr[i]&&arr[i]<=83) {
				int number = 8;
				sum = sum + number;
			}
			else if(84<=arr[i]&&arr[i]<=86) {
				int number = 9;
				sum = sum + number;
			}
			else if(87<=arr[i]&&arr[i]<=90) {
				int number = 10;
				sum = sum + number;
			}
		}
		System.out.println(sum);
	}
}
