package 백준_5단계_;

public class Selfnumber {
	
	
	static int d(int number) { // 메소드 생성
		
		int box = number ;
			// 1235  + 5 + 3 + 2 + 1
			while(number != 0) 
			{
				box =  box + number %10 ;
				number = number / 10 ;
			}
		

		return box ;
		}

	public static void main(String[] args) {
		
		Selfnumber cal = new Selfnumber();
		boolean arr[] = new boolean[100000]; 
		//각 배열의 인덱스 번호에다가  트루 값을 집어 넣고 거짓인 인덱스 번호들만 추출
		
		for(int i=0; i<10000; i++) {
			
			arr[d(i)] = true ;
		}
		
		
		for(int i=0; i<10001; i++) {
		
			if(arr[i] == false) 
			{
			System.out.println(i);
			}
		}

		}
	}


