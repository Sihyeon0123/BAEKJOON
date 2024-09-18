// [2022 KAKAO TECH INTERNSHIP] 성격 유형 검사하기(118666)
import java.util.*;

class Solution {
    public static void main(String[] args){
        String [] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int [] choices = {5, 3, 2, 7, 5};
        String result = solution(survey, choices);
        System.out.println(result);
    }

    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> result = new HashMap<>();
        char[] personality = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        
        for(char p: personality){
            result.put(p, 0);
        }
        
        int len = choices.length;
        for(int i=0; i<len; i++){
            char q1 = survey[i].charAt(0);
            char q2 = survey[i].charAt(1);
            int c = choices[i];
            
            if (c < 4) {
                result.put(q1, result.get(q1) + (4 - c)); // 3점, 2점, 1점으로 처리
            } else if (c > 4) {
                result.put(q2, result.get(q2) + (c - 4)); // 1점, 2점, 3점으로 처리
            }
        }
        
        for(int i=0; i<personality.length; i=i+2){
            int s1 = result.get(personality[i]);
            int s2 = result.get(personality[i+1]);
            
            if(s2 > s1){
                answer += Character.toString(personality[i + 1]);
            } else{
                answer += Character.toString(personality[i]);
            }
        }
        
        return answer;
    }
}