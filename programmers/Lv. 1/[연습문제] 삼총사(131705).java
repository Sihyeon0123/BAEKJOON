// [연습문제] 과일 장수(135808)
import java.util.*;

class Solution {
    public static void main(String[] args){
        int [] number = {-2, 3, 0, 2, -5};
        int result = solution(number);
        System.out.println(result);
    }

    public static int solution(int[] number) {
        int answer = 0;
        
        for(int i=0; i<number.length-2; i++){
            for(int j=i+1; j<number.length-1; j++){
                for(int k=j+1; k<number.length; k++){
                    int sum = number[i] + number[j] + number[k];
                    // System.out.println(number[i] + " + " + number[j] + " + " + number[k]);
                    if(sum == 0){
                       answer++; 
                    }
                }
            }
        }
        
        return answer;
    }
}