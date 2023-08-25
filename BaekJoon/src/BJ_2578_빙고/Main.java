package BJ_2578_빙고;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static int[] dr = { 0, 1, 1, 1 }; // 우 우하 하 좌하
	public static int[] dc = { 1, 1, 0, -1 };

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int[][] bingo = new int[5][5];

		int ans = 0;

		// 빙고 입력받기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				bingo[i][j] = sc.nextInt();
			}
		}
		// 사회자가 숫자 부를 때마다 0으로 바꾸기
		outer: for (int k = 1; k <= 25; k++) {
			int called = sc.nextInt();
			int total_cnt = 0;

			row: for (int r = 0; r < 5; r++) {
				for (int c = 0; c < 5; c++) {
					if (bingo[r][c] == called) {
						bingo[r][c] = 0;
						break row;
					}
				}
			}

			// 전체에서 연속으로 있는 0이 5개인지 체크
			for (int r = 0; r < 5; r++) {
				for (int c = 0; c < 5; c++) {

					if (bingo[r][c] != 0)
						continue;

					for (int d = 0; d < 4; d++) {
						int cnt = 1;
						int nr = r + dr[d];
						int nc = c + dc[d];
						while (0 <= nr && nr < 5 && 0 <= nc && nc < 5 && bingo[nr][nc] == 0) {
							nr += dr[d];
							nc += dc[d];
							cnt++;
						}
						if (cnt == 5) {
							total_cnt++;
						}
						if (total_cnt == 3) {
							ans = k;
							break outer;
						}
					}
				}
			}
		}
		System.out.println(ans);
//		for (int i = 0; i < 5; i++) {
//			System.out.println(Arrays.toString(bingo[i]));
//		}

	}

}
