package BJ_2605_줄세우기;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		int N = sc.nextInt();
//		int[] students = new int[N];
		for(int i = 1; i <= N; i++) {
			list.add(sc.nextInt(),i);
		}
		for (int i = N-1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}

	}

}
