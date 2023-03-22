package 백준_12단계_;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class 백준_12단계_체스판 {

	public static boolean[][] arr; // 클래스나 메소드에만 접근제어자 쓰는줄알았는데 아니였다.
	public static int min = 64;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int row = Integer.parseInt(st.nextToken()); // 입력받는 체스판 가로 길이
		int col = Integer.parseInt(st.nextToken()); // 입력받는 체스판 세로 길이

		arr = new boolean[row][col];

		for (int i = 0; i < row; i++) { // 입력받는 문자에 따라 true false 구분짓기
			String str = br.readLine();
			for (int j = 0; j < col; j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}

		int find_row = row - 7;
		int find_col = col - 7;

		for (int i = 0; i < find_row; i++) {
			for (int j = 0; j < find_col; j++) {
				find(i, j);
			}
		}
		System.out.println(min);
	}

	public static void find(int x, int y) {
		int end_x = x + 8; // 체스판을 탐색하는 범위가 8x8이기 때문에
		int end_y = y + 8; // 체스판을 탐색하는 범위가 8x8이기 때문에
		int count = 0; // 체스판 하나하나 블럭을 검사해서 원래 있어야하는 값이 없을때마다 카운트 세주기

		boolean scan = arr[x][y]; // 체스판에 첫 블럭이 true 인지 false인지에 따라서 달라지니까 첫 값 넣어줄 변수

		for (int i = x; i < end_x; i++) { // 잘못들어간 블럭이 있는지 탐색 시작
			for (int j = y; j < end_y; j++) {

				if (arr[i][j] != scan) { // 잘못들어간 블럭이 있다면 그 블럭의 갯수 세기
					count++;
				}

				scan = (!scan); // 탐색한 블럭의 다음 블럭은 다른 값이 와야하니 바꿔줘야지
			}
			scan = (!scan); // 탐색한 블럭의 다음 블럭은 다른 값이 와야하니 바꿔줘야지
		}

		count = Math.min(count, 64 - count); // ???
		min = Math.min(min, count); // 탐색 범위가ㅏ 8x8로 체스판 블럭은 최대 64개이니까
	}
}
