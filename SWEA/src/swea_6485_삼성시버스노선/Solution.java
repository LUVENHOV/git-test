package swea_6485_삼성시버스노선;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int[] bus = new int[5001];
			
			int N = sc.nextInt();
			for (int i = 0; i < N; i++) {
				int A = sc.nextInt();
				int B = sc.nextInt();
				
				for(int j = A; j <= B; j++) bus[j]++;
			}
			System.out.print("#" + tc + " ");
			int P = sc.nextInt();
			for (int i = 0; i < P; i++) {
				int j = sc.nextInt();
				System.out.print(bus[j] + " ");
			}
			System.out.println("");
		}
	}
}
