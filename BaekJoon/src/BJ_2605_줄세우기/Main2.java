package BJ_2605_줄세우기;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> students = new ArrayList<>();
		int N = sc.nextInt();

		for(int i = 1; i <= N; i++) {
			students.add(sc.nextInt(),i);
//			System.out.println(students);
		}
		for (int i = N-1; i >= 0; i--) {
			System.out.print(students.get(i) + " ");
		}

	}

}
