package 백준;

import java.util.Scanner;
import java.util.Stack;

public class 백준_후위표기식2_1935번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int N = sc.nextInt(); //넥스트인트를 하면 숫자는 n으로 들어가지만 다음 문자열을 입력하기전에 개행을 하는데 개행도 입력에 포함되기에 다음 str에는 개행인 빈칸이 들어가게 된다.
		int N = Integer.parseInt(sc.nextLine()); //넥스트 라인을 해야 입력 받은 숫자가 들어가고 개행을 무시할수 있다.
		String str = sc.nextLine();

		Stack<Double> st = new Stack<>();
		double result = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isLetter(ch)) {
				st.add((double) (str.charAt(i) - 'A'+1));
			} else {
				double number2 = st.pop();
				double number1 = st.pop();

				

				switch (ch) {
				case '+':
					result = number1 + number2;
					break;
				case '-':
					result = number1 - number2;
					break;
				case '*':
					result = number1 * number2;
					break;
				case '/':
					result = number1 / number2;
					break;
				}
				st.add(result);
			}
			
		}
		System.out.printf("%.2f", st.pop());

	}

}
