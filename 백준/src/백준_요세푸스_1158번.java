package 백준;

import java.io.*;
import java.util.*;

public class 백준_요세푸스_1158번 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList();
	
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=N; i++) {
			queue.add(i);
		}
		sb.append("<");
		while(queue.size() != 1) {// 원에서 사이즈가 1일 될때까지 계속 뽑아야지 사이즈가 1아니면 true니까 반복 
			
			for(int i=0; i<K-1; i++) {
				queue.add(queue.poll());
			}
			sb.append(queue.poll()+", ");
			
		}
		
		sb.append(queue.poll()+">");
		System.out.println(sb);
	}

}
