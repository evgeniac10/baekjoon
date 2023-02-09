package 백준_7단계_;

import java.util.*;

public class 백준_7단계_부녀회장 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
	
		int floor = 0;
		int room = 0;
		int arr[][] = new int [15][15]; //[층][호]
		
		for(floor =0; floor<1 ; floor++) {
			for(room=1; room<15; room++) {
				arr[floor][room] = room;
			}
		}
		//0층에 호수별로 숫자 넣기 (1부터 넣기)
		for(room=1; room<2; room++) {
			for(floor=1; floor<15; floor++) {
				arr[floor][room] = 1;
			}
		}
		//각층마다 1호에 1씩 넣기 
		for(floor =1; floor < 15; floor++) {
			for(room = 2; room < 15; room ++) {
				arr[floor][room]= arr[floor-1][room] + arr[floor][room-1];
			}
		}
		for(int i =0; i<T; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
		System.out.println(arr[k][n]);
	}
}
}
