package swea_1224;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		// 직접 작성하진 않아. (SWEA 문제 : 계산기1:+ / 계산기2:+* / 계산기3: +*()-/ 권장사항)
		// 스택을 배열을 이용해서 만들던지 / Stack<Character> / Stack<Integer>

		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int length = sc.nextInt();
			String str = sc.next();
			char[] arr = str.toCharArray();
			ArrayList<Character> ans = new ArrayList<>(); // 완성본
			Stack<Character> operator = new Stack<>(); // 연산자 스택
			Stack<Integer> nums = new Stack<>(); // 숫자 스택

			// 조건문을 통해서 우선순위를 확인할 수도 있고 (작성 가넝)
			// Map을 이용하여 우선순위를 확인할 수도 있겠다. (아래것을 활용해서 작성도 가넝)
			Map<Character, Integer> priority = new HashMap<>();
			priority.put('+', 1);
			priority.put('-', 1);
			priority.put('*', 2);
			priority.put('/', 2);
			priority.put('(', 0); // 우선순위로 쳌 할건 스택 내부에서만 쳌

			for (int i = 0; i < length; i++) {
				if (arr[i] == '+' || arr[i] == '-' || arr[i] == '*' || arr[i] == '/' || arr[i] == '('
						|| arr[i] == ')') { // 연산자의 경우
					if (operator.empty() || arr[i] == '(') { // 비어 있거나 스택 외부에서 '('를 만나면 무조건 push
						operator.push(arr[i]);
					} else if (arr[i] == ')') { // 닫는 소괄호를 만나면
						while (operator.peek() != '(') { // 스택의 맨 위가 여는 괄호가 될 때까지! priority에 넣어놓지 않았기 때문에 제일 처음 else if에 작성
							ans.add(operator.pop()); // 스택의 값들을 pop
						}
						operator.pop(); // 여는 괄호 pop

					} else if (priority.get(operator.peek()) < priority.get(arr[i])) { // arr[i]의 우선순위가 스택 맨 위의 값보다 클 때
																						// push
						operator.push(arr[i]);
					} else if (priority.get(operator.peek()) >= priority.get(arr[i])) { // arr[i]가 작거나 같을 시 클 때까지 pop 후
																						// push
						// arr[i]의 priority가 operator의 값보다 priority가 높을때까지 pop
						while (!operator.isEmpty() && priority.get(operator.peek()) >= priority.get(arr[i])) {
							ans.add(operator.pop());
						}
						operator.push(arr[i]);
					}

				} else
					ans.add(arr[i]); // 피연사자는 완성본에 추가하기
			}
			while (operator.size() != 0) {
				ans.add(operator.pop());
			}

//			System.out.println(ans.toString()); // 후위 표기 확인

			/*
			 * 중위 -> 후위표기 문자열로 중위표기식이 들어올 것이다. Stack : 연산자를 담아야 해 1. 글자를 하나씩 읽는다. (반복문을 통해서)
			 * 2. 피연산자라면 출력한다. 3. 연산자라면.... 3-1. 스택이 공백상태라면 그냥 넣는다. push 3-2. 스택이 공백상태가 아니라면
			 * top을 확인하고 내가 찍어누를수 있으면 그냥 push / 못누르면 누를 수있는거 나올때까지 pop하여 출력하고 push 3-3. 연산자
			 * 우선순위는 /* , +-, ( <-- 조금 특별해 3-4. 닫는 괄호라면 여는 소괄호를 만날 때까지 pop하여 출력하고, 여는 소괄호는
			 * 그냥 pop 4. 토큰을 다 못읽었으면 다시 1번부터 시작 5. 다읽고 끝났는데 스택이 공백이 아니라면 공백이 될때까지 pop하면서 출력
			 */

			/*
			 * 후위표기 -> 계산 문자열로 만들어진 후위표기식이 있을 것이다. Stack : 피연산자를 담는다. 1. 글자를 읽는다. 2. 피연산자라면
			 * 스택에 넣는다. 3. 연산자라면 필요한 피연사자의 개수만큼 꺼내어 계산하고 다시 넣는다. (순서 매우 중요) 4. 읽은 토큰이 남았다면
			 * 다시 1번부터 시작 5. 다읽고 처리했다면 pop하여 결과 출력
			 * 
			 */
			for (int i = 0; i < ans.size(); i++) {
				if (ans.get(i) != '+' && ans.get(i) != '-' && ans.get(i) != '*' && ans.get(i) != '/') {
					nums.push(ans.get(i)-'0');
				} else {
					if (ans.get(i) == '+') {
						int temp = nums.pop() + nums.pop();
						nums.push(temp);
					}
//					if (ans.get(i) == '-') {
//						int temp = nums.pop() - nums.pop();
//						nums.push(temp);
//					}
					if (ans.get(i) == '*') {
						int temp = nums.pop() * nums.pop();
						nums.push(temp);
					}
//					if (ans.get(i) == '/') {
//						int temp = nums.pop() / nums.pop();
//						nums.push(temp);
//					}
					
				}
			}
			System.out.println("#" + tc + " " + nums.pop());
		}
	}
}
