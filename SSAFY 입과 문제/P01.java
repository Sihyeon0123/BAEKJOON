/**
 * N명의 사람이 있다. 사람들은 1번부터 번호가 붙어 있다.
 * M개의 과자가 있다.
 *
 * 1번째 라운드에서는 1번 사람에게 1개의 과자를 주고,
 * 2번 사람에게 2개를 주는 방식으로 진행하며,
 * N번 사람에게는 N개의 과자를 준다.
 *
 * 남은 과자가 있으면 2번째 라운드에서는
 * 1번 사람에게 N개의 과자를 주고,
 * 2번 사람에게는 N-1개, 3번 사람에게는 N-2개, ...
 * 마지막 사람에게는 1개의 과자를 준다.
 *
 * 즉, 홀수 번째 라운드에서는 과자 개수를 1에서 하나씩 늘려가며 주고,
 * 짝수 번째 라운드에서는 N에서 하나씩 줄여가며 준다.
 *
 * 지정된 개수만큼 과자를 주지 못하면 모든 과정은 종료된다.
 * 마지막에 주지 못한 과자는 몇 개가 남는가?
 *
 * 예제 입력:
 * N = 4, M = 24
 *
 * 예제 결과:
 * 1
 *
 * 예제 풀이:
 * 1번째 라운드:
 *   1번 사람에게 1개, 2번 사람에게 2개, 3번 사람에게 3개, 4번 사람에게 4개 → 총 10개 소모
 * 2번째 라운드:
 *   1번 사람에게 4개, 2번 사람에게 3개, 3번 사람에게 2개, 4번 사람에게 1개 → 총 10개 소모
 * 3번째 라운드:
 *   1번 사람에게 1개, 2번 사람에게 2개 → 총 3개 소모 (누적 23개)
 * 남은 과자는 1개이므로 더 이상 라운드를 진행할 수 없다.
 * 따라서 남은 과자는 1개이다.
 */

 public class P01 {
    public static void main(String[] args) {
        int n = 4;   // 사람 수
        int m = 24;  // 과자 수
        int round = 1;

        while (true) {
            boolean given = false;
            if (round % 2 == 1) {
                // 홀수 라운드: 1부터 N까지
                for (int i = 1; i <= n; i++) {
                    if (m >= i) {
                        m -= i;
                        given = true;
                    } else {
                        System.out.println(m);
                        return;
                    }
                }
            } else {
                // 짝수 라운드: N부터 1까지
                for (int i = n; i >= 1; i--) {
                    if (m >= i) {
                        m -= i;
                        given = true;
                    } else {
                        System.out.println(m);
                        return;
                    }
                }
            }
            round++;
        }
    }
}
