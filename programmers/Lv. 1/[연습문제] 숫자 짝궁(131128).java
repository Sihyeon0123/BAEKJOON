// [연습문제] 숫자 짝궁(131128)
class Solution {
    public static void main(String[] args){
        String X = "100";
        String Y = "2345";
        String result = solution(X, Y);
        System.out.println(result);
    }

    public static String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] x = new int[10];
        int[] y = new int[10];
        
        for(int i=0; i<X.length(); i++){
            x[X.charAt(i) - '0']++;
        }
        
        for(int i=0; i<Y.length(); i++){
            y[Y.charAt(i) - '0']++;
        }
        
        for(int i=9; i>=0; i--){
            int len = x[i] > y[i] ? y[i]: x[i];
            for(int j=0; j<len; j++){
                answer.append(i);   
            }
        }
        
        if(answer.length() == 0){
            return "-1";
        }
        // 첫자리가 0이면 뒷자리도 0
        if(answer.charAt(0) == '0'){
            return "0";
        }
        return answer.toString();
    }
}