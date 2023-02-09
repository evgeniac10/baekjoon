package 백준_7단계_;

import java.util.*;
import java.math.BigInteger;

public class 백준_7단계_큰수 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		BigInteger big = new BigInteger(A);
		BigInteger big_2 = new BigInteger(B);
		
		
		
		System.out.println (big.add(big_2));
		sc.close();
	}
}
