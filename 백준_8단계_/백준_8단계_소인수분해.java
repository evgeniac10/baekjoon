package 백준_8단계_;

import java.util.*;

public class 백준_8단계_소인수분해 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		if (N == 1) {
			System.out.println();
		}
		for(int pri=2; pri<=N; pri++) {
			if(N % pri == 0) {
				 arr.add(pri);//소인수 분해하여 해당하는 소수인 숫자 저장
				N = N / pri;//소인수 분해하여 남은 숫자
				pri =1;
			}
		}
	for(int i =0; i<arr.size(); i++)
		System.out.println(arr.get(i));
	in.close();}
}
