package swea_1979_어디에단어가들어갈수있을까;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int ans = 0;
			int[][] board = new int[N+1][N+1];//0으로 막힌 배열 생성
			
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					board[i][j] = sc.nextInt();
				} // 입력받기
			}
			
			for(int r = 0; r < N; r++) {
				int cnt = 0;
				for(int c = 0; c < N+1; c++) {
					if(board[r][c] == 0) {
						if(cnt == K) ans++;
						cnt = 0;
					}else cnt++;
				}
			}
			
			for(int c = 0; c < N; c++) {
				int cnt = 0;
				for(int r = 0; r < N+1; r++) {
					if(board[r][c] == 0) {
						if(cnt == K) ans++;
						cnt = 0;
					}else cnt++;
				}
			}
            System.out.println("#"+tc+" "+ans);
		}
	}
}