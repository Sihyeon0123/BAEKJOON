// 약수의 개수와 덧셈(77884)

class Solution {
    public static void main(String[] args){
        int left = 13;
        int right = 17;
        int result = solution(left, right);
        System.out.println(result);
    }

    public static int solution(int left, int right) {
        int answer = 0;
        
        for(int n=left; n<=right; n++){
            int count = 0;
            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    count++;  // i가 약수
                    if (i != n / i) {
                        count++;  // i가 n의 제곱근이 아니면, 대응되는 다른 약수도 카운트
                    }
                }
            }    
            
            if(count % 2 == 0){
                answer += n;
            } else {
                answer -= n;
            }
        }
        return answer;
    }
}