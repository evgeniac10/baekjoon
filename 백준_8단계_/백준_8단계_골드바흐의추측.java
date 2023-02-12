package 백준_8단계_;

import java.util.*;

public class 백준_8단계_골드바흐의추측 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			int num = N/2 ;
			if(N==4) {
				System.out.println(2+" "+2);
			}
			else if(num%2 ==0){
				System.out.println((N/2)-1 + " " + ((N/2)+1));
			}
			else {	
				System.out.println((N/2) + " " + (N/2));
			}
		}
	}
}
