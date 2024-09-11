// [연습문제] 푸드 파이트 대회 (134240)
class Solution {
    public static void main(String[] args){
        int [] food = {1, 3, 4, 6};
        String result = solution(food);
        System.out.println(result);
    }

    public static String solution(int[] food) {
        String answer = "";
        
        for(int i=1; i<food.length; i++){
            food[i] = food[i] / 2;
            for(int j=0; j<food[i]; j++){
                answer = answer + String.valueOf(i);
            }
        }
        String reversed = new StringBuilder(answer).reverse().toString();
    
        return answer + "0" + reversed;
    }
}