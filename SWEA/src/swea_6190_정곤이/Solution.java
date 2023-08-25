package swea_6190_정곤이;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt(); // 입력받을 수의 개수
			int[] nums = new int[N]; // 입력받을 배열
			ArrayList<Integer> multiples = new ArrayList(); // 곱셈값들 저장할 배열
			int max = 0;

			for (int i = 0; i < N; i++) {
				nums[i] = sc.nextInt();
			} // nums 배열 값 입력받기

			for (int i = 0; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {
					multiples.add(nums[i] * nums[j]);
				}
			}
			for (int i = 0; i < multiples.size(); i++) {
				// 한자리 수인 경우
//				if(multiples.get(i)<10) {
//					if(multiples.get(i) > max) max = multiples.get(i);
//				}
				String temp = multiples.get(i) + "";
//					str.charAt(multiples.get(i))
//					while (temp/10 >= 10)
				boolean success = true;
				for(int j = 0; j < temp.length()-1; j++) {
					if(temp.charAt(j) > temp.charAt(j+1)) {
						success = false;
						break;
					}
				}
				
				if (success) {
					if(Integer.parseInt(temp) > max) max = Integer.parseInt(temp);
				}
				
			}
			System.out.println(max);
//			System.out.println(multiples);
		}
	}

}
