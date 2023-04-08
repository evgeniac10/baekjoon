package 백준;

import java.util.*;

public class 백준_오큰수_17298번 {

	public static void main(String[] args) {

//		isEmpty -> 비었니? 예(true)
//		!isEmpty ->들어있니? 예(true)
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] sequence = new int[T];
		int[] nge = new int[T];
		Stack<Integer> st = new Stack<>();
		int i;
		for(i=0; i<T; i++) {
			sequence[i] = sc.nextInt();
		}
		
		for(i=0; i<T; i++) {
			for(int j=T-1; j>i; j--) {
				if(sequence[i]<sequence[j]) {
					st.add(sequence[j]);
//					System.out.println(i);
					System.out.println(j);
					System.out.println(sequence[j]);
				}
			}
			//스택에 들어있는거 다 꺼내서 마지막에 남아있는 숫자를 출력
			
		}
		
	}

}
