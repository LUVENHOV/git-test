package swea_1216;

import java.util.Scanner;
import java.io.FileNotFoundException;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			sc.nextInt();

			char[][] board = new char[100][100];

			for (int r = 0; r < 100; r++) {
				board[r] = sc.next().toCharArray();
			}

			int L;

			length: for (L = 100; L >= 1; L--) {// 점점 줄이면서 탐색하면 하나라도 찾으면 가장 긴 회문
				// 가로 방향 회문 체크
				for (int r = 0; r < 100; r++) {
					col: for (int c = 0; c < 100 - L + 1; c++) {
						// 문자열 시작위치 결정 후 회문 체크
						for (int i = 0; i < L / 2; i++) {
							if (board[r][c + i] != board[r][c + L - 1 - i])
								continue col;
						}
						break length;
					}
				}

				// 세로 방향 회문 체크
				for (int c = 0; c < 100; c++) {
					row: for (int r = 0; r < 100 - L + 1; r++) {
						// 문자열 시작위치 결정 후 회문 체크
						for (int i = 0; i < L / 2; i++) {
							if (board[r + i][c] != board[r + L - 1 - i][c])
								continue row;
						}
						break length;
					}
				}
			}
			System.out.println("#" + tc + " " + L);
		}
	}
}
