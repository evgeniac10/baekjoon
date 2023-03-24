package 백준;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class 백준_단어뒤집기_9093번 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Character> stack = new Stack<>(); // 제네릭 타입을 선언해주지 않으면 Stack에는 Object타입으로 컴파일 에러가 난ㄴ다
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String str = br.readLine() + "\n";
			for (char ch : str.toCharArray()) { // 문자열을 하나씩 분리하여 ch에 넣는다
				if (ch == ' ' || ch == '\n') { // 띄어쓰기나 다음줄이 오는경우 스택에 쌓인 각 문자를 버퍼에 넣는다.
					while (!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					bw.write(" "); // 띄어쓰기도 스택에 포함 시켜야하니까 
				} else {
					stack.push(ch);
				}
			}
			bw.write("\n");
		}
		bw.flush(); // 오류를 막기위하여 flush로 버퍼에 쌓인 데이터가 있으면 완전히 청소한다.
		br.close();
		bw.close();
	}

}
