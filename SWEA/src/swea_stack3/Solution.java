package swea_stack3;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int K = sc.nextInt();
			int[] arr =  new int[K+1];
			
			int pos = 0;
			for(int i = 0; i< K; i++) {
				int num = sc.nextInt();
				if(num == 0) pos--;
				else arr[++pos] = num;
			}
			int ans = 0;
			for(int i = 1; i <= pos;i++)ans += arr[i];
			System.out.println("#" + tc + " " + ans);
		}
	}

}
