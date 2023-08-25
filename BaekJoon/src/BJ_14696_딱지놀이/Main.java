package BJ_14696_딱지놀이;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		// 4 : 별
		// 3 : 원
		// 2 : 사각형
		// 1 : 삼각형
		// 4의 개수 비교 -> 3의 개수 비교 -> 2의 개수 비교 -> 1의 개수 비교 -> 무승부
		int N = sc.nextInt(); // 총 라운드 수
		for (int i = 0; i < N; i++) {// 라운드 횟수 동안 반복
			int[] a_list = new int[4];
			int[] b_list = new int[4];
			int a = sc.nextInt(); // A 딱지에 나온 그림 개수 입력받기
			for (int j = 0; j < a; j++) {
				int a_nums = sc.nextInt(); // a만큼 그림 입력받기 1~4
				a_list[a_nums - 1]++;
			}

			int b = sc.nextInt(); // B 딱지에 나온 그림 개수
			for (int j = 0; j < b; j++) {
				int b_nums = sc.nextInt(); // b만큼 그림 입력받기 1~4
				b_list[b_nums - 1]++;
			}
//			System.out.println(Arrays.toString(a_list));
//			System.out.println(Arrays.toString(b_list));
			
			for (int k = 3; k >= 0; k--) {
				if (a_list[k] == b_list[k] && k > 0)
					continue;
				if (a_list[k] > b_list[k]) {
					System.out.println("A");
					break;
				}
				else if(b_list[k] > a_list[k]) {
					System.out.println("B");
					break;
				}
				else System.out.println("D");;
			} // 끝
		}
	}
}
