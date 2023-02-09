package 백준_8단계_;

import java.util.*;

public class 백준_8단계_소수구하기 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Boolean> arr = new ArrayList<Boolean>();
		
		int start = in.nextInt();
		int finish = in.nextInt();
		
		for(int number = start; number<=finish; number++) {
			if(number < 2) {
				arr.add(false);
			}
				
			else if(number ==2) {
				arr.add(true);

			}
			else {
				for(int i =2; i< number; i++) {
					if(number % i ==0) {
						arr.add(false);
					}
				}
				arr.add(true);

			}
		}
		for(int i =0; i<arr.size(); i++) {
			if(arr.get(i) == true) {
			System.out.println(arr.indexOf(i));
		}
	}
 	}

}
