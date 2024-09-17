// [2023 KAKAO BLIND RECUITMENT] 가장 많이 받은 선물(258712)
import java.util.*;

class Solution {
    public static void main(String[] args){
        String[] friends = {"joy", "brad", "alessandro", "conan", "david"};
        String[] gifts = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
        int result = solution(friends, gifts);
        System.out.println(result);
    }

    public static int solution(String[] friends, String[] gifts) {
        int answer = Integer.MIN_VALUE;
        HashMap<String, Integer> gift_point = new HashMap<>();
        HashMap<String, Integer> friend_indexs = new HashMap<>();
        int[][] gift_exchange = new int[friends.length][friends.length];
        int[] result = new int[friends.length];
        
        // 선물지수 계산을 위한 hashMap 생성
        int index=0;
        for(String friend: friends){
            gift_point.put(friend, 0);   
            friend_indexs.put(friend, index++);
        }
        
        for(String gift: gifts){
            String[] names = gift.split(" ");
            // 선물지수 계산
            gift_point.put(names[0], gift_point.get(names[0]) + 1);
            gift_point.put(names[1], gift_point.get(names[1]) - 1);
            
            // 주고받은 선물 표
            int send = friend_indexs.get(names[0]);
            int receive = friend_indexs.get(names[1]);
            gift_exchange[send][receive]++;
        }
        
        // for (Map.Entry<String, Integer> entry : gift_point.entrySet()) {
        //     System.out.println(entry.getKey() + " " + entry.getValue());
        // }
        
        int len = friends.length;
        for(int y=0; y<len; y++){
            int point = gift_point.get(friends[y]);
            for(int x=0; x<len; x++){
                // 자기 자신이 아니라면
                if(y != x){
                    // 상대방보다 선물을 많이 보냈다면
                    if(gift_exchange[y][x] > gift_exchange[x][y]){
                        result[y]++;
                        continue;
                    }
                    if(point > gift_point.get(friends[x])){
                        if((gift_exchange[y][x]==0 && gift_exchange[x][y] == 0) || (gift_exchange[y][x] == gift_exchange[x][y])){
                            result[y]++;
                        }
                    }
                }
            }
        }
        
        for(int i=0; i<len; i++){
            // System.out.print(result[i] + " ");
            if(answer < result[i]){
                answer = result[i];
            }
        }
        return answer;
    }
}