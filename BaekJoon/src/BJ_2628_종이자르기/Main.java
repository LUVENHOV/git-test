package BJ_2628_종이자르기;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);

		int column = sc.nextInt();
		int row = sc.nextInt();
		int column_max = 0;
		int row_max = 0;
		int ans = 0;

		ArrayList<Integer> column_list = new ArrayList();
		ArrayList<Integer> row_list = new ArrayList();

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int direction = sc.nextInt();
			int cut = sc.nextInt();

			if (direction == 0)
				row_list.add(cut);
			else
				column_list.add(cut);
		}

		Collections.sort(column_list);
		Collections.sort(row_list);

		if (column_list.size() == 0)
			column_max = row;
		else {
			// max값 후보 1 : 배열의 첫번째 값까지
			int num1 = column_list.get(0);
			// max값 후보 2 : 마지막 값에서 끝까지
			int num2 = column - column_list.get(column_list.size() - 1);
			column_max = Math.max(num1, num2); // 두 후보 중 max값 1차 설정
			// max값 후보 3 : 입력받은 값들의 차들 중 가장 큰 값
			if (column_list.size() > 1) {
				for (int i = 0; i < column_list.size() - 1; i++) {
					if (column_list.get(i + 1) - column_list.get(i) > column_max)
						column_max = column_list.get(i + 1) - column_list.get(i);
				}
			}
		}

		if (row_list.size() == 0)
			row_max = row;
		else {
			// max값 후보 1 : 배열의 첫번째 값까지
			int num3 = row_list.get(0);
			// max값 후보 2 : 마지막 값에서 끝까지
			int num4 = row - row_list.get(row_list.size() - 1);
			row_max = Math.max(num3, num4); // 두 후보 중 max값 1차 설정
			// max값 후보 3 : 입력받은 값들의 차들 중 가장 큰 값
			if (row_list.size() > 1) {
				for (int i = 0; i < row_list.size() - 1; i++) {
					if (row_list.get(i + 1) - row_list.get(i) > row_max)
						row_max = row_list.get(i + 1) - row_list.get(i);
				}
			}
		}
		ans = column_max * row_max;
//		System.out.println(column_max);
//		System.out.println(row_max);
		System.out.println(ans);
	}

}
