package 백준_4단계_;

import java.util.*;

public class 백준_4단계_나머지 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<10; i++)
		{
			int num =sc.nextInt();
			set.add(num % 42);
		}
		System.out.print(set.size());
	}
}