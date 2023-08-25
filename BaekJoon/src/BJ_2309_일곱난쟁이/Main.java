package BJ_2309_일곱난쟁이;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);

		int[] dwarfs = new int[9];
		int[] ans = new int[7];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			dwarfs[i] = sc.nextInt();
			sum += dwarfs[i];
		}
		int T=0;
		int K=0;
		// 뺄 숫자 두개 탐색하기
		outer : for (int i = 0; i < 8; i++) {
			T = dwarfs[i];
			for (int j = i+1; j < 9; j++) {
				K = dwarfs[j];
				if (K == T)
					continue;

				if (sum - T - K == 100)
					break outer;
			}
		}
		
		for (int a = 0; a < 9; a++) {
			if (dwarfs[a] == T || dwarfs[a] == K)
				dwarfs[a] = 0;
		}
		
		int index = 0;
		for (int i = 0; i < 9; i++) {
			if(dwarfs[i] != 0) {
					ans[index++] = dwarfs[i];
			}
		}
		
		Arrays.sort(ans);
		
//		System.out.println(Arrays.toString(dwarfs));
//		System.out.println(Arrays.toString(ans));
		for (int i = 0; i < 7; i++) {
			System.out.println(ans[i]);
		}
	}
}
