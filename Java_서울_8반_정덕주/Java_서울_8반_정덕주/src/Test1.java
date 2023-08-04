
public class Test1 {
	public static void main(String[] args) {
		int N = 7;

		// 1 ~ N for문
		for (int i = 1; i <= N; i++) {
			
			// 1~ (N/2) 까지는 i 만큼 별을 출력하고 N/2 + 1 ~ N 까지는 N - i +1 만큼 출력
			// 예를 들어 N이 7이면 i 가 1 ~ 3 까지는 i만큼 출력 ( 1 -> 1, 2 -> 2, 3 -> 3 )
			// i가 4 ~ 7 까지는 (N-i+1) 만큼 출력 ( 4 -> 4, 5 -> 3, 6 -> 2, 7 -> 1)
			for (int j = 0; j < (i > N / 2 ? N - i + 1 : i); j++) {
				System.out.print("*");
			}
			
			// for문 끝날 때마다 줄바꿈
			System.out.println();
		}
	}

}
