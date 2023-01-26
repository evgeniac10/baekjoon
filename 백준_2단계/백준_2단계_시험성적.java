package 백준_2단계;

import java.util.Scanner;

public class 백준_2단계_시험성적 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a>= 90)
			{
			System.out.println("A");
			}
		
		else if (89>= a && a >=80) 
			{
			System.out.println("B");
			}
		
		else if (79>= a && a >=70) 
			{
			System.out.println("C");
			}
		
		else if (69>= a && a >=60) 
			{
			System.out.println("D");
			}
		
		else {
			System.out.println("F");
			}
		}
	}


