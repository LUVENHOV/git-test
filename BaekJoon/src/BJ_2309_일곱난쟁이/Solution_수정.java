package BJ_2309_일곱난쟁이;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_수정 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);

		int[] dwarfs = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			dwarfs[i] = sc.nextInt();
			sum += dwarfs[i];
		}
		// 전체 합 구하기

		int T = 0;
		int K = 0;
		// 뺄 숫자 두개 탐색하기
		outer: for (int i = 0; i < 8; i++) {
			for (int j = i+1; j < 9; j++) {
				if (sum - dwarfs[i] - dwarfs[j] == 100) {
					dwarfs[i] = 0;
					dwarfs[j] = 0;
					break outer;
				}
			}
		}
		Arrays.sort(dwarfs);
		StringBuilder sb = new StringBuilder();
		int index = 0;
		for (int i = 0; i < 9; i++) {
			if (dwarfs[i] != 0) {
//				System.out.println(dwarfs[i]);
				sb.append(dwarfs[i]+ "\n");
			}
		}
		System.out.println(sb);
//		System.out.println(Arrays.toString(dwarfs));
//		System.out.println(Arrays.toString(ans));

	}
}
