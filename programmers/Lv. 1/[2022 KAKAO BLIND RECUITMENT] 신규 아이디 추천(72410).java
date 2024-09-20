// [2022 KAKAO BLIND RECUITMENT] 신규 아이디 추천(72410)

class Solution {
    public static void main(String[] args){
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        String result = solution(new_id);
        System.out.println(result);
    }

    public static String solution(String new_id) {
        String answer = "";
        // 1. 대문자를 소문자로 치환
        new_id = new_id.toLowerCase();
        // System.out.println(new_id);
        
        // 2. 알파벳 소문자, 숫자, -, _, .을 제외한 모든 문자를 제거
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        // System.out.println(new_id);
        
        // 3. .이 2번 이상 연속된 경우 제거
        new_id = new_id.replaceAll("\\.{2,}", ".");
        // System.out.println(new_id);
        
        // 4. 처음이나 끝에 존재하는 . 제거
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        // System.out.println(new_id);
        
        // 5. 빈 문자열이라면 "a" 대입
        new_id = new_id.equals("") ? "a": new_id;
        // System.out.println(new_id);
        
        // 6. 문자열의 길이가 16 이상이면, 15번째 까지로 자름,
        // 그 후 마지막 문자가 .이면 제거
        if(new_id.length() > 15) new_id = new_id.substring(0, 15);
        new_id = new_id.replaceAll("\\.$", "");
        // System.out.println(new_id);
        
        // 7. 문자열의 길이가 2 이하라면 new_id의 마지막 문자를 3이 될 때까지 반복
        if(new_id.length() < 3){
            String last = new_id.substring(new_id.length() - 1);
            while(new_id.length() < 3){
                new_id += last;
            }
        }
        // System.out.println(new_id);
        
        answer = new_id;
        return answer;
    }
}