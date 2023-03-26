package 백준;

import java.io.*;
import java.util.*;

public class 백준_큐_10845번 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList();
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int last =0;
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			switch (str) {
			case "push": 
				int N = Integer.parseInt(st.nextToken());
				last = N;
				queue.add(N); // add메서드는 큐가 다 차서 더이상 추가가 불가 할때 예외를 발생 , offer메서드는 큐에 삽입이 안되면 false를 반환 되면 true반환 
//				sb.append(N+"\n");
				break;
			
			case "pop": 
				if (queue.isEmpty()) {
					sb.append(-1 + "\n");
					break;
				}
				else
				sb.append(queue.poll()+"\n");
				break;
			
			case "size": 
				sb.append(queue.size() + "\n");
				break;
			
			case "empty": 
				boolean x = queue.isEmpty();
				if (x == false) {
					sb.append(0 + "\n");
					break;
				} else {
					sb.append(1 + "\n");
					break;
				}
			
			case "front": 
				if (queue.isEmpty()) {
					sb.append(-1 + "\n");
					break;
				}
				else
				sb.append(queue.peek()+"\n");
				break;
			
			case "back": 
				if (queue.isEmpty()) {
					sb.append(-1 + "\n");
					break;
				}
				else
				sb.append(last + "\n");
				break;
			}
		}
		System.out.println(sb);
	}
}
