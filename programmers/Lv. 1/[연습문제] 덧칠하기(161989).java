//[연습문제] 덧칠하기(161989)
import java.util.*;

class Solution {
    public static void main(String[] args){
		int n = 8;
		int m = 4;
        int [] section = {2, 3, 6};
        int result = solution(n, m, section);
		System.out.println(result);
    }

    public static int solution(int n, int m, int[] section) {
        int answer = 1;
        int num = section[0] + m - 1;
        
        for(int i=1; i<section.length; i++){
            if(section[i] <= num){
                continue;
            }else{
                answer += 1;
                num = section[i] + m - 1;
            }
        }
        
        return answer;
    }
}