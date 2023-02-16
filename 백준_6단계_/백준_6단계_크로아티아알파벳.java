package 백준_6단계_;

import java.util.Scanner;
public class 백준_6단계_크로아티아알파벳 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'c') {
				if (str.charAt(i + 1) == '=') {
					i++;
					count++;
				} else if (str.charAt(i + 1) == '-') {
					i++;
					count++;
				} else {
					count++;
					continue;
				}
			} else if (str.charAt(i) == 'd') {
				if (str.charAt(i + 1) == 'z') {
					if (str.charAt(i + 2) == '=') {
						i = i + 2;
						count++;
					} else {
						count = count + 2;
						i++;
					}
				} else if (str.charAt(i + 1) == '-') {
					i++;
					count++;
				} else {
					count++;
				}
			} else if (str.charAt(i) == 'l') {
				if (str.charAt(i + 1) == 'j') {
					i++;
					count++;
				} else {
					count++;
					continue;
				}
			} else if (str.charAt(i) == 'n') {
				if (str.charAt(i + 1) == 'j') {
					i++;
					count++;
				} else {
					count++;
					continue;
				}
			} else if (str.charAt(i) == 's') {
				if (str.charAt(i + 1) == '=') {
					i++;
					count++;
				} else {
					count++;
					continue;
				}
			} else if (str.charAt(i) == 'z') {
				if (str.charAt(i + 1) == '=') {
					i++;
					count++;
				} else {
					count++;
					continue;
				}
			} else {
				count++;
			}
		}
		System.out.println(count);
	}

}
