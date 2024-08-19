//[연습문제] 달리기 경주(178871)
import java.util.*;

class Solution {
    public static void main(String[] args){
        String [] players = {"mumu", "soe", "poe", "kai", "mine"};
        String [] callings = {"kai", "kai", "mine", "mine"};
		System.out.println("sdfsdf");
        String [] temp = solution(players, callings);
        for(String a: temp){
            System.err.println(a);
        }
    }

    public static String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap<String, Integer> mappedByPlayer = new HashMap<>();
		HashMap<Integer, String> mappedByRank = new HashMap<>();

        // 맵 초기화
		for (int i = 0; i < players.length; i++) {
			mappedByPlayer.put(players[i], i);
			mappedByRank.put(i, players[i]);
		}

        for (String call: callings) {
			// 추월한 유저 순위
			// 추월한 유저 이름
			int currentRank = mappedByPlayer.get(call);
			String player = mappedByRank.get(currentRank);

			// 바로 앞 플레이어
			String frontPlayer = mappedByRank.get(currentRank - 1);

			// swap
			mappedByPlayer.put(player, currentRank - 1);
			mappedByPlayer.put(frontPlayer, currentRank);

			mappedByRank.put(currentRank - 1, player);
			mappedByRank.put(currentRank, frontPlayer);
		}
        
        for (int i = 0; i < players.length; i++) {
			answer[i] = mappedByRank.get(i);
		}

        return answer;
    }
}