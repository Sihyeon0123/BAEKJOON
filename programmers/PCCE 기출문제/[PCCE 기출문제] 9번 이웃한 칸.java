class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        // 상, 하, 좌, 우
        int dx[] = {0, 0, -1, 1};
        int dy[] = {-1, 1, 0, 0};
        
        String base_color = board[h][w];
        
        for(int i=0; i < 4; i++){
            int nx = w + dx[i];
            int ny = h + dy[i];
            
            if((0 <= nx && nx < board.length) && (0 <= ny && ny < board[0].length)){
                if(base_color.equals(board[ny][nx])){
                    answer += 1;
                }
            }
        }
        return answer;
    }
}