package 백준_7단계_;

import java.util.Scanner;

public class 백준_7단계_벌집 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int room = 1;
		int save = 2;
		
		if(N == 1) 
		{
			System.out.println(1);
		}
		else 
		{
			while(true) 
			{
				if(N >= save) 
				{
				save = save + (room*6) ;
				room++;
				}
				else 
				{
				System.out.println(room);
				break;
				}
			}
		}
		sc.close();
	}
}
