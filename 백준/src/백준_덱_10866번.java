package 백준;

import java.io.*;
import java.util.*;

public class 백준_덱_10866번 {
	static ArrayList<Integer> list = new ArrayList<>();

	static void push_front(int result) {
		list.add(0, result);
	}

	static void push_back(int result) { // 1 2 3 4 (0 1 2 3)
		list.add(result); //  1 2 3 4 5( 0 1 2 3 4)
	}

	static int pop_front() {
		if (list.isEmpty())
			return -1;
		else {
			int x = list.get(0);
			list.remove(0);
			return x;
		}
	}

	static int pop_back() {
		if (list.isEmpty())
			return -1;
		else {
			int x = list.get(list.size()-1);
			list.remove(list.size()-1);
			return x;
		}
	}

	static int size() {
		return list.size();
	}

	static int empty() {
		if (list.isEmpty())
			return 1;
		else
			return 0;
	}

	static int front() {
		if (list.isEmpty())
			return -1;
		else
			return list.get(0);

	}

	static int back() {
		if (list.isEmpty())
			return -1;
		else
			return list.get(list.size()-1);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String cmd = st.nextToken();
			switch (cmd) {
			case "push_back": {
				int nextnumber = Integer.parseInt(st.nextToken());
				push_back(nextnumber);
				break;
			}
			case "push_front": {
				push_front(Integer.parseInt(st.nextToken()));
				break;
			}
			case "front": {
				sb.append(front() + "\n");
				break;
			}
			case "back": {
				sb.append(back() + "\n");
				break;
			}
			case "size": {
				sb.append(size() + "\n");
				break;
			}
			case "empty": {
				sb.append(empty() + "\n");
				break;
			}
			case "pop_front": {
				sb.append(pop_front() + "\n");
				break;
			}
			case "pop_back": {
				sb.append(pop_back() + "\n");
				break;
			}

			}
		}
		System.out.println(sb);
	}

}
