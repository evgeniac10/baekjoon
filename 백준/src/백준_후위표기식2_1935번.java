package 백준;

import java.util.Scanner;
import java.util.Stack;

public class 백준_후위표기식2_1935번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String str = sc.nextLine();

		Stack<Double> st = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isLetter(ch)) {
				st.add((double) (str.charAt(i) - 'A'));
				System.out.println(st.pop());
			} else {
				double number1 = st.pop();
				double number2 = st.pop();

				double result = 0;

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
