package swea_1218;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		
		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			String str = sc.next();
			char[] chr = str.toCharArray();
			char[] check = new char[N];
			int idx = 0;
			for(int i = 0; i < N; i++) {
				if (chr[i] == '(' || chr[i] == '{' || chr[i] == '[' || chr[i] == '<') {
					check[idx++] = chr[i];
				} else if (chr[i] == ')' || chr[i] == '}' || chr[i] == ']' || chr[i] == '>') {
					
				}
			}
		}
	}

}
