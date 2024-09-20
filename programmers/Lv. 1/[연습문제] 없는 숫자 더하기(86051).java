// [연습문제] 없는 숫자 더하기(86051)
class Solution {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,6,7,8,0};
        int result = solution(numbers);
        System.out.println(result);
    }

    public static int solution(int[] numbers) {
        int answer = 0;
        int[] nums = new int[10];
        
        for(int n: numbers){
            nums[n]++;
        }
        
        for(int i=0; i<10; i++){
            if(nums[i] == 0){
                answer += i;
            }
        }
        
        return answer;
    }
}