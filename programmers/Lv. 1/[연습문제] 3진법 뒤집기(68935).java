// [연습문제] 3진법 뒤집기(68935)

class Solution {
    public static void main(String[] args){
        int n = 125;
        int result = solution(n);
        System.out.println(result);
    }

    public static int solution(int n) {
        int answer = 0;
        String temp = "";
        
        while(n > 2){
            temp += Integer.toString(n % 3);
            n = n / 3;
        }
        
        temp += Integer.toString(n);
        
        for(int i=0; i<temp.length(); i++){
            int a = Integer.parseInt(temp.substring(i, i+1));
            answer += Math.pow(3, temp.length() - i - 1) * a;
        }
        return answer;
    }
}