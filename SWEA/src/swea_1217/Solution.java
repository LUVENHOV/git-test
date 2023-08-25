package swea_1217;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {

			int tc_num = sc.nextInt();
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int result = func(N,M);
			System.out.println("#" + tc_num + " " + result);
		}

	}


	public static int func(int num, int num2) {
		if (num2 == 1) {
			return num;
		}
		return num * func(num, num2-1);
	}
}
