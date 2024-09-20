// [연습문제] 없는 숫자 더하기(86051)
class Solution {
    public static void main(String[] args){
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        int result = solution(babbling);
        System.out.println(result);
    }

    public static int solution(String[] babbling) {
        int answer = 0;
        String[] can = {"ma", "ye", "woo", "aya"};
        String[] cant = {"mama", "yeye", "woowoo", "ayaaya"};
        
        for(String b: babbling){
            for(String ct: cant){
                b = b.replace(ct, "0");
            }
            for(String c: can){
                b = b.replace(c, "1");
            }
            
            b = b.replace("1", "");
            if(b.equals("")){
                answer++;
            }
        }
        
        return answer;
    }
}