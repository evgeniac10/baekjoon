package 백준_4단계_;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_4단계_10811번 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		for (int i = 0; i < M; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			int ch = Integer.parseInt(st2.nextToken());
			int ch2 = Integer.parseInt(st2.nextToken());
			while(ch < ch2) {
				int box = arr[ch-1];
				arr[ch-1] = arr[ch2-1];
				arr[ch2-1] = box;
				ch++;
				ch2--;
			}
		}
		for(int j=0; j<N; j++) {
		System.out.print(arr[j] + " ");
		}
	}
}
