// [2022 KAKAO BLIND RECUITMENT] 신고 결과 받기(92334)
import java.util.*;

class Solution {
    public static void main(String[] args){
        String [] id_list = {"muzi", "frodo", "apeach", "neo"};
        String [] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        int [] result = solution(id_list, report, k);
        for(int a: result){
            System.out.println(a);
        }
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        // 신고 기록을 저장하는 HashMap (신고당한 사람 -> 신고한 사람 Set)
        Map<String, Set<String>> reportMap = new HashMap<>();
        Map<String, Integer> indexs = new HashMap<>();
        
        int index = 0;
        for(String id: id_list){
            indexs.put(id, index++);
        }
        
        for(String r: report){
            String[] names = r.split(" ");
            // names[1]가 있는지 확인하고 없으면 빈 hashSet 반환
            Set<String> reporter = reportMap.getOrDefault(names[1], new HashSet<String>());
            // 신고자 목록에 추가
            reporter.add(names[0]);
            // reportMap 업데이트
            reportMap.put(names[1], reporter);
        }
        
        // HashMap을 순회
        for(Map.Entry<String, Set<String>> rm: reportMap.entrySet()){
            // Value(Set<String>) 가져오기
            Set<String> reporter = rm.getValue(); 
            // 신고당한 횟수(신고자 수)가 k이상이라면
            if(reporter.size() >= k){
                // 신고자에게 메일 발송
                for(String r: reporter){
                    answer[indexs.get(r)]++;
                }
            }
        }
        
        return answer;
    }
}