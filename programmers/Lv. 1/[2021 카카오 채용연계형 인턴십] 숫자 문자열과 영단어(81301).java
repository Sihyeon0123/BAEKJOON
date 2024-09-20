// [연습문제] 없는 숫자 더하기(86051)
class Solution {
    public static void main(String[] args){
        String s = "2three45sixseven";
        int result = solution(s);
        System.out.println(result);
    }

    public static int solution(String s) {
        int answer = 0;
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven" , "eight", "nine"};
        
        for(int i=0; i<words.length; i++){
            s = s.replace(words[i], Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}