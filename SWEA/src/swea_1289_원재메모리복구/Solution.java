package swea_1289_원재메모리복구;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String origin = sc.next();
			char[] origin_char = new char[origin.length()];
			for (int i = 0; i < origin.length(); i++) {
				origin_char[i] = origin.charAt(i);
			}
			int cnt = 0;

			for (int i = 0; i < origin_char.length; i++) {
				// 첫 1이 나왔을 때 해당 인덱스부터 끝까지 1로 변경 cnt++
				if (i == 0 && origin_char[0] == '1') {
					cnt++;
					//이전 숫자와 다르면 해당 인덱스부터 끝까지 반대로 변경 cnt++
				} else if (i >= 1 && origin_char[i] != origin_char[i - 1]) {
					cnt++;
				}
			}
			System.out.println("#" + tc + " " + cnt);
		}
	}
}
