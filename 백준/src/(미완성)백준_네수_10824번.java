package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_네수_10824번 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String[] str = br.readLine().split(" "); // 배열의 개수를 정해주지 않더라도 입력한 만큼 배열이 만들어 진다 .
		
		int num1 = Integer.parseInt(str[0]+str[1]);
		int num2 = Integer.parseInt(str[2]+str[3]);
		System.out.println(num1+num2);
	}

}
