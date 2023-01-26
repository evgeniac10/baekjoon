package 백준_2단계;
import java.util.Scanner;
public class 백준_2단계_두수비교 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a>b) {
			System.out.print(">");
		}
		
		else  if(a<b){
			System.out.print("<");
		}
		else {
			System.out.print("==");
		}
	sc.close();}

}
