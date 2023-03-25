package 백준;

import java.io.*;
import java.util.*;

public class 백준_스택수열_1874번 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> st = new Stack();
		int T = Integer.parseInt(br.readLine());
		int stack_num = 1; // 스택에 오름차순으로 차례대로 숫자 넣기 위해 만듬

		for (int i = 0; i < T; i++) {

			int num = Integer.parseInt(br.readLine()); // 입력 받은 숫자를 기준으로 스택에 넣을지 말지 결정

			if (stack_num <= num) {// 입력받은 숫자까지만큼 스택에 숫자 넣어서 쌓기
				for (int j = stack_num; j <= num; j++) {
					st.push(j);
					bw.write("+" + "\n");
				}
				stack_num = num + 1;
			} else if (st.peek() != num) {// 스택에 쌓인 값중에 가장 먼저 나올수있는 값과 입력받은 숫자와 비교
				bw = new BufferedWriter(new OutputStreamWriter(System.out)); //만들수 없는 수열이므로 버퍼비우기 
				bw.write("NO");
				break;// peek()와 pop()의 차이 값을 꺼내고 삭제 하냐 안하냐
			}
			st.pop();
			bw.write("-" + "\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
