// [2023 KAKAO BLIND RECUITMENT] 개인정보 수집 유효기간(150370)
class Solution {
    public static void main(String[] args){
        String today = "2022.05.19";
        String [] terms = {"A 6", "B 12", "C 3"};
        String [] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        int [] result = solution(today, terms, privacies);
        for(int a: result){
            System.out.println(a);
        }
    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        // 오늘날짜 str -> int
        String temp_answer = "";
        String [] today_str = today.split("\\.");
        String temp = "";
        for(String a: today_str){
            temp += a;
        }
        int today_num = Integer.parseInt(temp);

        // 유형별 계약기간 저장
        String [] terms_type = new String[terms.length];
        int [] terms_period = new int[terms.length];
        int index = 0;
        for(String term: terms){
            String [] term_split = term.split(" ");
            terms_type[index] = term_split[0];
            terms_period[index] = Integer.parseInt(term_split[1]) * 28;
            index++;
        }
        
        // 가입날짜
        int r_index = 1;
        for(String privacy: privacies){
            // 가입날짜 str -> int
            String temp_date = "";
            // 공백으로 나누어 날짜와 유형으로 분리
            String [] privacy_split = privacy.split(" ");
            // 계약 유형
            String type = privacy_split[1];
            // 계약 날짜
            String [] privacy_date_split = privacy_split[0].split("\\.");
            int day = Integer.parseInt(privacy_date_split[2]);
            int month = Integer.parseInt(privacy_date_split[1]);
            int year = Integer.parseInt(privacy_date_split[0]);

            // 계약 유형에 따른 기간을 찾기
            for(int i=0; i<terms_type.length; i++){
                if(type.equals(terms_type[i])){
                    // 최대 계약기간 구하기
                    // 일수(day)에 계약기간을 더한 후 28을 넘어가면 달(month)로 넘긴다.
                    day += terms_period[i] - 1;
                    // day가 28을 넘으면 month로 넘김
                    month += (day - 1) / 28;
                    day = (day - 1) % 28 + 1;

                    // month가 12를 넘으면 year로 넘김
                    year += (month - 1) / 12;
                    month = (month - 1) % 12 + 1;
                    break;
                }
            }
            
            // 계산한 날짜를 
            String result = String.format("%02d", year) + String.format("%02d", month) + String.format("%02d", day);
            int result_num = Integer.parseInt(result);
            if(today_num > result_num){
                temp_answer += Integer.toString(r_index) + " ";
            }
            r_index++;
        }
        
        String [] result_split = temp_answer.split(" ");
        
        int [] answer = new int[result_split.length];
        
        for(int i=0; i< result_split.length; i++){
            answer[i] = Integer.parseInt(result_split[i]);
        }
        
        return answer;
    }
}