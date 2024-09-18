//[연습문제] 공원 산책(172928)
class Solution {
    public static void main(String[] args){
        int [][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int result = solution(sizes);
        System.out.println(result);
    }

    public static int solution(int[][] sizes) {
        int answer = 0;
        int big = Integer.MIN_VALUE;
        int small = Integer.MIN_VALUE;
        
        for(int[] size: sizes){
            int b = size[0] > size[1] ? size[0]: size[1];
            int s = size[0] < size[1] ? size[0]: size[1];
            System.out.println(b + " " + s);
            if(big < b){
                big = b;
            }
            if(small < s){
                small = s;
            }
        }
        System.out.println(big + " " + small);
        answer = small * big;
        return answer;
    }
}