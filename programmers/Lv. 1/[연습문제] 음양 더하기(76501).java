// [연습문제] 음양 더하기(76501)

class Solution {
    public static void main(String[] args){
        int [] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        int result = solution(absolutes, signs);
        System.out.println(result);
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0; i<absolutes.length; i++){
            if(signs[i]){
                answer += absolutes[i];
            } else {
                answer += absolutes[i] * -1;
            }
        }
        return answer;
    }
}