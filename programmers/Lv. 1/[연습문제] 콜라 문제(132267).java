//[연습문제] 콜라 문제(132267)
class Solution {
    public static void main(String[] args){
        int a = 2;
        int b = 1;
        int n = 20;
        int result = solution(a, b, n);
        System.out.println(result);
        
    }

    public static int solution(int a, int b, int n) {
        int answer = 0;
       while(n >= a) {
           int new_bottles = (n / a) * b; // 얻은 새 음료수 병의 개수
           answer += new_bottles;         // 총 얻은 음료수 병 수 누적
           n = n - (n / a) * a + new_bottles;  // 현재 음료수 병 개수 갱신
       }
       return answer;
   }
}