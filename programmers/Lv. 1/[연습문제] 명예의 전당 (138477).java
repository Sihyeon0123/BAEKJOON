// [연습문제] 명예의 전당 (138477)
import java.util.*;

class Solution {
    public static void main(String[] args){
        int k = 3;
        int [] score = {10, 100, 20, 150, 1, 100, 200};
        int [] result = solution(k, score);
        for(int a: result){
            System.out.println(a);
        }
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> hof = new ArrayList<>();

        for(int i=0; i<score.length; i++){
            if(hof.size() < k){
                hof.add(score[i]);
            } else{
                if(hof.get(0) < score[i]){
                    hof.remove(0);
                    hof.add(score[i]);
                }
            }
            Collections.sort(hof);
            answer[i] = hof.get(0);
        }

        return answer;
    }
}