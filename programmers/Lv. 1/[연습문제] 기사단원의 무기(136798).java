// 기사단원의 무기(134798)
import java.lang.Math;

class Solution {
    public static void main(String[] args){
        int number = 5;
        int limit = 3;
        int power = 2;

        int result = solution(number, limit, power);
        System.out.println(result);
    }
    public static int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i=1; i<=number; i++){
            int cnt = 0;
            for (int j=1; j<=(int)Math.sqrt(i); j++){
                if (i % j == 0){
                    cnt += 2;
                }
                if (j * j == i){
                    cnt -= 1;
                } 
            }

            answer += limit < cnt ? power : cnt;
        }

        return answer;
    }
}