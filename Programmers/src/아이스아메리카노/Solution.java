package 아이스아메리카노;

class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int price = 5500;
        
        int coffee = money/price;
        int left = money%price;
        
        answer[0] = coffee;
        answer[1] = left;
        
        return answer;
    }
}