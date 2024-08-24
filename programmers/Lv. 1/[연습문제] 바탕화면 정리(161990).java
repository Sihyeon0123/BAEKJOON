//[연습문제] 바탕화면 정리(161990)
class Solution {
    public static void main(String[] args){
        String [] wallpaper = {".#...", "..#..", "...#."};
        int [] result = solution(wallpaper);
        for(int a: result){
            System.out.println(a);
        }
    }

    public static int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int lux = 50, luy = 50;   // 왼쪽 상단
        int rbx = 0, rby = 0;   // 오른쪽 하단

        for(int y=0; y<wallpaper.length; y++){
            for(int x=0; x<wallpaper[0].length(); x++){
                if(wallpaper[y].charAt(x) == '#'){
                    // System.out.printf("현재 좌표: %d %d\n", y, x);
                    if(lux > x){
                        lux = x;
                    }
                    if(luy > y){
                        luy = y;
                    }
                    if(rbx < x){
                        rbx = x;
                    }
                    if(rby < y){
                        rby = y;
                    }
                }
            }
        }
        rby += 1;
        rbx += 1;
        // System.out.printf("상단 왼쪽(%d %d) 하단 오른쪽:(%d %d)", luy, lux, rby, rbx);
        
        answer[0] = luy;
        answer[1] = lux;
        answer[2] = rby;
        answer[3] = rbx;
        return answer;
    }
}