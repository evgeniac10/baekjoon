package 백준_7단계_;
import java.util.*;
public class 백준_7단계_설탕배달 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bag = sc.nextInt();
		int result = 0;
		
		if(bag ==4 || bag ==7) {
			result = -1;
		}
		else if(bag % 5 == 1 ) {
			result = (bag/5)-1 + 2;
		}
		else if(bag % 5 == 2 || bag % 5 == 4) {
			result = (bag/5) - 2 + 4;
		}	
		else if(bag % 5 == 3) {
			result = (bag / 5) + 1;
		}
		else if(bag % 5 == 4) {
			result = (bag / 5 ) - 1 + 3;
		}			
		else if(bag % 5 == 0) {
			result = bag / 5;
		}
			System.out.println(result);
	sc.close();
	}
}
