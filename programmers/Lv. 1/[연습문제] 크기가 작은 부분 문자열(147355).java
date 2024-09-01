// [연습문제] 크기가 작은 부분 문자열(147355)
import java.math.*;

class Solution {
    public static void main(String[] args){
        // 1 ~ 10000자리 사이의 문자열
        String t = "3141592";
        String p = "271";
        int result = solution(t, p);
        System.out.println(result);
    }

    public static int solution(String t, String p) {
        int answer = 0;
        int window_size = p.length();
        BigInteger p_num = new BigInteger(p);
        
        for(int i=0; i<=t.length() - window_size; i++){
            String sub_string = t.substring(i, i+window_size);
            BigInteger sub_num = new BigInteger(sub_string);
            if(sub_num.compareTo(p_num) <= 0){
                answer++;
            }
        }
        
        return answer;
    }
}