package 백준;

import java.io.*;
import java.util.*;

public class 백준_괄호_9012번 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			bw.write(vps(br.readLine()) + "\n");
			bw.flush(); // flush메서드를 사용하지 않을 경우 출력이 안됨 왜냐면 bw라는객체에 저장만한것으로 되기때문에
		}
		
		br.close();
		bw.close(); // 닫지 않는다고 해서 문제가 되지는 않겠지만 왜냐면 jvm이 종료될때 자동으로 닫히니 그치만 보장되지는 않는다. 
	}

	static String vps(String str) {
		Stack<Character> st = new Stack();

		for (int j = 0; j < str.length(); j++) {

			char ch = str.charAt(j);

			if (ch == '(') { // '(' 이거를 입력받으면 스택에 저장해 놓는다.
				st.push(ch);
			} else if (st.isEmpty()) { // ')'이거를 입력받으면 스택에 있는 저장된 값을 꺼낸다. 하지만 isempty라는 메서드로 꺼낼게 없는경우도 생각해준다.
				return "NO"; // isEmpty메서드가 false라면 꺼낼게 있다는것이니 else로 갈것이다.
			} else { // ')' 입력받으면 스택에 저장되어있는 값을 꺼낸다.
				st.pop();
			}
		}

		// (())이거처럼 반복문을 다 하고도 이상이 없는경우에는 "Yes"를 출력해준다.
		if (st.isEmpty()) {
			return "Yes";
		} else {
			return "No";
		}
		// 스택안에 아직 저장되어있는 값이 있다면 no를 출력해준다.
	}
}
