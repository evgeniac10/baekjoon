package 백준;

import java.io.*;
import java.util.*;

public class 백준_에디터_1406번 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		Stack<Character> stack2 = new Stack<>();

		String str = br.readLine();

		for (int i = 0; i < str.length(); i++) {
			stack.add(str.charAt(i));
		}
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			String cmd = br.readLine(); //P x
			char ch = cmd.charAt(0);
			switch (ch) {
			case 'L': {
				if (stack.isEmpty())break;
				stack2.add(stack.pop());
				break;
			}
			case 'D': {
				if (stack2.isEmpty())break;
				stack.add(stack2.pop());
				break;
			}
			case 'B': {
				if (stack.isEmpty()) break;
				stack.pop();
				break;
			}
			case 'P': {
				stack.add(cmd.charAt(2));
				break;
			}
			}
		}
		while (!stack.isEmpty()) {
			stack2.add(stack.pop());
		}
		while (!stack2.isEmpty()) {
			sb.append(stack2.pop());
		}
		System.out.println(sb);
	}
}
