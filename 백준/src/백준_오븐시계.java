package 백준;

import java.util.Scanner ;

public class 백준_오븐시계 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 int hour = sc.nextInt();
	 int minute = sc.nextInt();
	 int plus_time = sc.nextInt();
	 
	 int new_hour = ((hour*60 + minute + plus_time) / 60 ) % 24;
	 int new_minute = (hour*60 + minute + plus_time) % 60 ;
	
	 System.out.print(new_hour +" "+ new_minute);
	 
	 
	 

	
	 

	}

}
