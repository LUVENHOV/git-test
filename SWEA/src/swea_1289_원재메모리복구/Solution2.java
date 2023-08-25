package swea_1289_원재메모리복구;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			char[] inputarr = sc.next().toCharArray();
			int cnt = 0;
			char[] originarr = new char[inputarr.length];

			for (int i = 0; i < inputarr.length; i++) {
				if (inputarr[i] == originarr[i])
					continue;
				else {
					for(int j = i; j < inputarr.length; j++) { //그 숫자부터 끝까지
//						if(originarr[j] == '0') originarr[j] = '1'; //1로 변경
//						else originarr[j] = '0';
						originarr[j] = inputarr[i];
					}
				cnt++;
				}
					
			}
			System.out.println(cnt);
		}
	}

}