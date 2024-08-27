//[연습문제] 카드 뭉치(159994)
import java.util.*;
class Solution {
    public static void main(String[] args){
        String [] cards1 = {"i", "drink", "water"};
        String [] cards2 = {"want", "to"};
        String [] goal = {"i", "want", "to", "drink", "water"};
        String result = solution(cards1, cards2, goal);
        System.out.println(result);
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        boolean result = true;
        List<String> cards1_lst = new ArrayList<>(Arrays.asList(cards1));
        List<String> cards2_lst = new ArrayList<>(Arrays.asList(cards2));
        List<String> goal_lst = Arrays.asList(goal);

        for (String word : goal) {
            if (!cards1_lst.isEmpty() && word.equals(cards1_lst.get(0))) {
                cards1_lst.remove(0);
            } else if (!cards2_lst.isEmpty() && word.equals(cards2_lst.get(0))) {
                cards2_lst.remove(0);
            } else {
                result = false;
                break;
            }
        }
        
        if(result){
            answer = "Yes";
        }else{
            answer = "No";
        }
        return answer;
    }
}