//[연습문제] 공원 산책(172928)
class Solution {
    public static void main(String[] args){
        int n = 1000000;
        int result = solution(n);
        System.out.println(result);        
    }

    public static int solution(int n) {
        int answer = 0;
        for(int i=1; i<n; i++){
            if(n % i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}