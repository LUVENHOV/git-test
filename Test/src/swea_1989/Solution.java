package swea_1989;

import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int result = 0;
			String text = sc.next();
			StringBuilder sb = new StringBuilder();
			sb.append(text);
			sb.reverse();
			if (text.equals(sb.toString()))
				result = 1;
			System.out.println("#" + test_case + " " + result);
		}
	}
}