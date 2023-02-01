package 백준_4단계_;

import java.util.Scanner;

public class 백준_4단계_평균넘기기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int student = 0;
		int T = sc.nextInt();
		
			for (int i = 0; i<T; i++) 
			{
				int sum = 0;
				int avg = 0;
				int count = 0;
				student = sc.nextInt();
				int arr[] = new int [student] ;
				for(int j= 0; j<student; j++) 
				{
					arr[j] = sc.nextInt();
					sum = sum + arr[j];
				}
				avg = (sum / student); // 여기까지 평균 구하
				for(int a= 0; a<student; a++)
				{	
					if(arr[a] > avg ) {
						count++; // 평균보다 높은 학생 수 만큼 카운
					}
				}
			double result = ((double)count / (double) student )*100 ;
			System.out.println(String.format("%.3f",result)+ "%");
			}
	}
}
