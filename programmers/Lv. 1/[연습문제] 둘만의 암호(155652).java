// [연습문제] 둘만의 암호(155652)
class Solution {
    public static void main(String[] args){
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        String result = solution(s, skip, index);
        System.out.println(result);
    }
    
    public static String solution(String s, String skip, int index) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < index; j++) {
                c += 1;
                if (c > 'z') {
                    c -= 26;
                }
                if (skip.contains(String.valueOf(c))) {
                    j--;
                }
            }
            answer += c;
        }
        return answer;
    }
}