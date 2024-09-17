//[연습문제] 햄버거 만들기(133502)
import java.util.*;

class Solution {
    public static void main(String[] args){
        int [] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int result = solution(ingredient);
        System.out.println(result);
    }

    public static int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> igd = new ArrayList<>();
        for (int num : ingredient) {
            igd.add(num);  
        }
        int i = 0;
        while(true){
            if(i + 3 >= igd.size()){
                break;
            }

            if(igd.get(i)==1 && igd.get(i+1)==2 && igd.get(i+2)==3 && igd.get(i+3)==1){
                answer++;
                for(int j=0; j<4; j++){
                    igd.remove(i);
                }

                i = i - 2;
                
                if(i < 0){
                    i = 0;
                }
            }
            else{
                i++;
            }
        }

        return answer;
    }
}