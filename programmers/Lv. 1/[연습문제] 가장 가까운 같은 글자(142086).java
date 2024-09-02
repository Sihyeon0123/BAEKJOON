// [연습문제] 가장 가까운 같은 글자(142086)
import java.util.*;
class Solution {
    public static void main(String[] args){
        String s = "banana";
        int [] result = solution(s);
        for(int a: result){
            System.out.println(a);
        }
    }

    public static int[] solution(String s) {
        HashMap<Character, Integer> dic = new HashMap<>();
        int[] answer = new int[s.length()];
        
        for(int i=0; i<s.length(); i++){
            char s_split = s.charAt(i);
            // 만약 사전에 들어있지 않다면
            if(!dic.containsKey(s_split)){
                answer[i] = -1;
                dic.put(s_split, i);
            }
            else{
                answer[i] = i - dic.get(s_split);
                dic.put(s_split, i);
            }
            
        }
        
        return answer;
    }
}