// [연습문제] 로또의 최고 순위와 최저 순위(77484)

class Solution {
    public static void main(String[] args){
        int [] lottos = {44, 1, 0, 0, 31, 25};
        int [] win_nums = {31, 10, 45, 1, 6, 19};
        int[] result = solution(lottos, win_nums);
        for(int r: result){
            System.out.println(r);
        }
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int w = 0, l = 0;
        for(int num: lottos){
            for(int w_num: win_nums){
                if(num == 0){
                    w++;
                    break;
                } else if(w_num == num){
                    w++;
                    l++;
                    break;
                }
            }        
        }
        
        answer[0] = w > 1 ? 7 - w: 6;
        answer[1] = l > 1 ? 7 - l: 6;
        return answer;
    }
}