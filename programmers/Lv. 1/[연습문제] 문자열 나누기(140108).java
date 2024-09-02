// [연습문제] 문자열 나누기(140108)
class Solution {
    public static void main(String[] args){
        String s = "banana";
        int result = solution(s);
        System.out.println(result);
    }

    public static int solution(String s) {
        int answer = 0;
        int i = 0;

        while (i < s.length()) {
            char x = s.charAt(i);
            int xCount = 0;
            int otherCount = 0;

            // 현재 부분 문자열을 찾기 위한 루프
            while (i < s.length()) {
                if (s.charAt(i) == x) {
                    xCount++;
                } else {
                    otherCount++;
                }
                i++;
                // xCount와 otherCount가 같아지는 순간 분리
                if (xCount == otherCount) {
                    break;
                }
            }
            answer++;
        }

        return answer;
    }
}