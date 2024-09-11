// [PCCP 기출문제] 1번 동영상 재생기(340213)
class Solution {
    public static void main(String[] args){
        String video_len = "07:22";
        String pos = "04:05";
        String op_start	= "00:15";
        String op_end = "04:07";
        String[] commands = {"next"};
        String result = solution(video_len, pos, op_start, op_end, commands);
        System.out.println(result);
    }

    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int total_len = stringToSecond(video_len);
        int op_start_s = stringToSecond(op_start);
        int op_end_s = stringToSecond(op_end);
        int pos_s = stringToSecond(pos);
        
        for(String command: commands){
            if(op_start_s <= pos_s && pos_s < op_end_s){
                pos_s = op_end_s;
            }
            if(command.equals("next")){
                pos_s += 10;
                if(pos_s > total_len){
                    pos_s = total_len;
                }
            }
            else{
                pos_s -= 10;
                if(pos_s < 0){
                    pos_s = 0;
                }
            }
        }
        if(op_start_s <= pos_s && pos_s < op_end_s){
            pos_s = op_end_s;
        }
        
        int m = pos_s / 60;
        int s = pos_s % 60;
        answer = String.format("%02d:%02d", m, s);
        return answer;
    }
    
    // String mm:ss 형태의 문자열을 초단위로 환산 후 int로 반환
    public static int stringToSecond(String time){
        String [] time_split = time.split(":");
        int seconde = Integer.parseInt(time_split[0]) * 60;
        seconde += Integer.parseInt(time_split[1]);
        return seconde;
    }
}