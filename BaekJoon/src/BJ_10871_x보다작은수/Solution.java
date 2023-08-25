package BJ_10871_x보다작은수;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<Integer>();

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			if (arr[i] < X) {
				A.add(arr[i]);
			}
		}
		for (int i =0; i < A.size(); i++) {
			System.out.print(A.get(i) + " ");
		}
	}
}