package 백준_7단계_;
import java.util.*;

public class 백준_7단계_달팽이 {

	static int tree(int go , int back , int day)
	{
		int result = day - go + back;

		return result;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		
		System.out.println(tree(first, second, third));

	}
// 5 -2 + 1
	//6 - 5 + 1
	//맨 오른쪽 빼기  맨왼쪽 더하기 가운
}
