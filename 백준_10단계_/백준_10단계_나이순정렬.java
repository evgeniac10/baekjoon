package 백준_10단계_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 백준_10단계_나이순정렬 {

	public static class Student {
		int age;
		String name;

		public Student(int age, String name) {
			this.age = age;
			this.name = name;
		}

		public int getage() {
			return this.age;
		}

		public void setage(int age) {
			this.age = age;
		}

		public String getname() {
			return this.name;
		}

		public void setname(String name) {
			this.name = name;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();
		
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			list.add(new Student(sc.nextInt(), sc.next()));
		}
//		for (int i = 0; i < T; i++) {
//			System.out.println(list.get(i).getage()+ " " + list.get(i).getname());
//		}

		Collections.sort(list , new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getage()-o2.getage();
			}
		});
		
		for(int i=0; i<T; i++) {
			System.out.println(list.get(i).getage()+ " " +list.get(i).getname());
		}
	}
}
