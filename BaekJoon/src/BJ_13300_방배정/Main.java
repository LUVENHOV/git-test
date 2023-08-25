package BJ_13300_방배정;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //참가하는 총 학생 수
		int K = sc.nextInt(); //한 방에 배정 가능한 최대 인원 수
		//남학생 여학생 배열 생성
		int[] man = new int[6];
		int[] woman = new int[6];
		int ans = 0;
		
		for(int i = 0; i < N; i++) {
			//성별 S와 학년 Y 입력받기
			int S = sc.nextInt(); //성별
			int Y = sc.nextInt()-1; //학년
			// S의 값이 0이면 여자, 1이면 남자
			// 학년에 추가
			if (S == 0) woman[Y]++;
			else man[Y]++;
		}
//		System.out.println(Arrays.toString(woman));
//		System.out.println(Arrays.toString(man));
		for(int i = 0; i < 6; i++) {
			if(woman[i] == 0) continue;
			else if(woman[i] <= 2) ans++;
			else if(woman[i] > 2) {
				int cnt = 0;
				cnt = woman[i]/2+1;
				ans += cnt;
			}
		}
		for(int i = 0; i < 6; i++) {
			if(man[i] == 0) continue;
			else if(man[i] <= 2) ans++;
			else if(man[i] > 2) {
				int cnt = 0;
				cnt = man[i]/2+1;
				ans += cnt;
			}
		}
		System.out.println(ans);
	}

}
