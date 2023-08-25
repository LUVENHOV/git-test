package BJ_2563_색종이;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		int length = 10;
		int[][] board = new int[100][100];
		int ans = 0;

		for (int tc = 1; tc <= N; tc++) {

			cnt = 0;

			int start_x = sc.nextInt();
			int start_y = sc.nextInt();

			// board의 값을 변경
			for (int i = start_x; i < start_x + 10; i++) {
				for (int j = start_y; j < start_y + 10; j++) {
					board[i][j] = 1;
				}
			}
		}
		for (int i=0; i < 100; i++) {
//		System.out.println(Arrays.toString(board[i]));
		}
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (board[i][j] == 1)
					ans++;
			}
		}
		System.out.println(ans);
	}

}
