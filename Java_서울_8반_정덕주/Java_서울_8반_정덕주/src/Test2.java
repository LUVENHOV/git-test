public class Test2 {
	public static void main(String[] args) {
		
		int[] arr = {50,8,-10,10,5};
		
		// bubble sort 구현 (오름차순)
		// 배열을 순차적으로 탐색하며 (for i 문) 매번 현재 값부터 첫번째 값까지 역순으로 비교 (for j 문)
		// 비교하는 인덱스의 값이 직전 인덱스의 값이 더 크면 두 값을 변경
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j-1]) {
					int tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		// 오름차순으로 정렬되어있음으로 맨 앞의 값이 최소값, 맨 뒤에서 두 번째 값이 두 번째로 큰 값
		int secondMax = arr[arr.length-2];
		int min = arr[0];
		
		System.out.println(myAbs(secondMax * min));
		
	}
	
	// 절대값 함수 구현
	public static int myAbs(int num) {
		
		// 음수이면 양수로 바꿔서 리턴
		if (num < 0) return num * -1;
		// 양수이거나 0이면 그대로 리턴
		return num;
	}

}
