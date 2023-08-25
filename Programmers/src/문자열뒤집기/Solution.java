package 문자열뒤집기;

class Solution {
	public String solution(String my_string) {
		String answer = "";
		char[] answer_arr = new char[my_string.length()];
		for (int i = 0; i < my_string.length(); i++) {
			answer_arr[i] = my_string.charAt(my_string.length() - 1 - i);
		}
		answer = String.valueOf(answer_arr);

		return answer;
	}
}