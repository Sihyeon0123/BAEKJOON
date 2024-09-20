// [연습문제] 없는 숫자 더하기(86051)
class Solution {
    public static void main(String[] args){
        int price = 3;
        int money = 20;
        int count = 4;
        long result = solution(price, money, count);
        System.out.println(result);
    }

    public static long solution(int price, int money, int count) {
        long answer = -1;
        
        long a = 0;
        if(count % 2 == 0){
            a = (count + 1) * (count / 2);
        } else {
            a = (count + 1) * (count / 2) + (count / 2 + 1) ;
        }
        
        answer = a * price - money;
        if(answer < 0){
            answer = 0;
        }
        return answer;
    }
}