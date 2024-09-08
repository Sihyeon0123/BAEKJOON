// [연습문제] 과일 장수(135808)
import java.util.*;

class Solution {
    public static void main(String[] args){
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        int result = solution(k, m, score);
        System.out.println(result);
    }
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        // score를 정렬
        Arrays.sort(score);
        // box개수를 구함
        int box_cnt = score.length / m;        
        // 박스의 개수만큼 반복
        for(int i=1; i<=box_cnt; i++){
            // 각 박스에서 가장 작은 값은 (score.length - m * i)에 위치
            int last_score = score[score.length - m * i];  
            answer += last_score * m;
        }
    
        return answer;
    }
}