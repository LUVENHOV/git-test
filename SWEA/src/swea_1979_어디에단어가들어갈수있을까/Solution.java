package swea_1979_어디에단어가들어갈수있을까;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[][] board = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					board[i][j] = sc.nextInt();
				}// 입력받기
			}
			//board 탐색
			int cnt = 0;
			int ans = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (board[i][j] == 1) cnt ++;
					else if (cnt > 0 && board[i][j] == 0) {
						if (cnt == K) ans++;
						cnt = 0;
					}
				}
				if (cnt == K) ans++;
				cnt = 0;
			}
			
			for (int j = 0; j < N; j++) {
				for (int i = 0; i < N; i++) {
					if (board[i][j] == 1) cnt ++;
					else if (cnt > 0 && board[i][j] == 0) {
						if (cnt == K) ans++;
						cnt = 0;
					}
				}
				if (cnt == K) ans++;
				cnt = 0;
			}
			System.out.printf("#%d %d\n", tc, ans);
		}

	}

}
