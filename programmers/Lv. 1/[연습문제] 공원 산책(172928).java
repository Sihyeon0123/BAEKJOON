//[연습문제] 공원 산책(172928)
class Solution {
    public static void main(String[] args){
        String [] park = {"SOO","OOO","OOO"};
        String [] routes = {"E 2","S 2","W 1"};
        int [] result = solution(park, routes);
        for(int a: result){
            System.out.println(a);
        }
    }

    public static int[] solution(String[] park, String[] routes) {
        int[] answer = new int [2];
        int x=0;
        int y=0;
        
        // park 사이즈
        int park_x_size = park[0].length();
        int park_y_size = park.length;
        
        // 동서남북에 따른 좌표 변화 방향
        int [] dx = {1, -1, 0, 0};
        int [] dy = {0, 0, 1, -1};
        
        // 초기위치 파악
        for(int i=0; i < park_y_size; i++){
            for(int j=0; j < park_x_size; j++){
                if(park[i].charAt(j) == 'S'){
                    x = j;
                    y = i;
                    break;
                }
            }
        }
        System.out.printf("초기 좌표: (%d, %d)\n", y, x);
        
        // 루트 및 이동크기 분할
        for(String route: routes){
            System.out.printf("현재 좌표: (%d, %d)\n", y, x);
            String[] temp = route.split(" ");
            String op = temp[0];
            int n = Integer.parseInt(temp[1]);
            // op에 따른 이동 방향 index
            int d_index = 0;
            if("W".equals(op)){
                d_index = 1;
            }else if("S".equals(op)){
                d_index = 2;
            }else if("N".equals(op)){
                d_index = 3;
            }
            System.out.printf("루트: %s(%d) %d\n", op, d_index, n);
            
            // 새로운 좌표 계산
            int nx = x + dx[d_index] * n;
            int ny = y + dy[d_index] * n;
            System.out.printf("예상이동좌표: (%d, %d)\n", ny, nx);
            
            // 범위를 벗어나는지 파악하기
            if(!((0 <= nx && nx < park_x_size) && (0 <= ny && ny < park_y_size))){
                System.out.println("범위를 벗어납니다.");
                continue;
            }
            // System.out.println("범위 안에 있습니다.");
            
            // 경로상에 장애물 확인
            boolean obs = false;
            
            // x좌표 이동, y좌표 이동 판단
            if(x != nx){ // x좌표 이동
                int sx = x > nx ? nx: x;
                int bx = x > nx ? x: nx;
                System.out.printf("sx, bx: (%d, %d)\n", sx, bx);
                
                for(int i=sx; i<=bx; i++){
                    if(park[y].charAt(i) == 'X'){
                        obs = true;
                        break;
                    }
                }
            }else{ // y좌표 이동
                int sy = y > ny ? ny: y;
                int by = y > ny ? y: ny;
                System.out.printf("sy, by: (%d, %d)\n", sy, by);
                
                for(int i=sy; i<=by; i++){
                    if(park[i].charAt(x) == 'X'){
                        obs = true;
                        break;
                    }
                }
            }
            
            if(obs){
                System.out.println("장애물이 있습니다.");
                continue;
            }
            // System.out.println("장애물이 없습니다.");
            x = nx;
            y = ny;
            System.out.printf("이동좌표: (%d, %d)\n\n", y, x);
        }
        
        answer[0] = y;
        answer[1] = x;
        return answer;
    }
}