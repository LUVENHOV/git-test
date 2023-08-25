package BJ_10163_색종이;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		int[][] board = new int[1001][1001];
		int[] ans = new int[N + 1];

		for (int tc = 1; tc <= N; tc++) {

			cnt = 0;

			int start_x = sc.nextInt();
			int start_y = sc.nextInt();
			int x_length = sc.nextInt();
			int y_length = sc.nextInt();

			// board의 값을 변경
			for (int i = start_x; i < start_x + x_length; i++) {
				for (int j = start_y; j < start_y + y_length; j++) {
					board[i][j] = tc;
				}
			}
		}

		for (int i = 0; i < 1001; i++) {
			for (int j = 0; j < 1001; j++) {
				if (board[i][j] >= 1)
					ans[board[i][j]]++;
			}
		}
		for (int i = 1; i <= N; i++) {
			System.out.println(ans[i]);
		}

	}
}
