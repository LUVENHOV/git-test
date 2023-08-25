package swea_1216;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			sc.nextInt();

			char[][] board = new char[100][100];

			for (int r = 0; r < 100; r++) {
				board[r] = sc.next().toCharArray();
			}
			
			int maxL = -1;
			
			for (int r = 0; r < 100; r++) {
				for(int c = 0; c < 100; c++) {
					//가로 확장
					int i = 0;
					
					while(c - i >= 0 && c + i < 100 && board[r][c + i] == board[r][c - i]) i++;
					maxL = Math.max(i * 2 -1, maxL);
					
					i = 0;
					while (c + i + 1 <100 && c - i >= 0 && board[r][c + i + 1] == board[r][c - i]) i++;
					maxL = Math.max(maxL, i * 2);
					
				}
			}
		}
	}
}
