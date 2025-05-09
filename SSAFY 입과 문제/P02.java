/**
 * N줄의 논문을 쓰려고 한다.
 * 밤이 깊어 커피를 많이 마시게 된다.
 *
 * 처음에 S줄의 논문을 쓴 후 커피를 한 잔 마신다.
 * 커피를 마시고 나면, 직전에 쓴 논문 줄 수를 D로 나눈 몫(정수)만큼의 줄 수를 다시 쓸 수 있다.
 * 이 과정을 반복하며, N줄을 모두 썼거나 더 이상 쓸 수 있는 논문 줄 수가 0이 되면 종료된다.
 *
 * N줄의 논문을 쓰기 위한 최소의 S는 얼마인가?
 *
 * 예제 입력:
 * N = 11, D = 2
 *
 * 예제 결과:
 * 7
 *
 * 예제 풀이:
 * S = 6으로 시작하는 경우:
 *   6 → 3 → 1 (총 10줄), 종료
 * S = 7로 시작하는 경우:
 *   7 → 3 → 1 (총 11줄), N줄 달성 가능
 * 따라서 최소 S는 7이다.
 */

 
public class P02 {
    public static void main(String[] args) {
        int n = 11;
        int d = 2;
        int answer = 0;

        for (int s = 1; s <= n ; s++) {
            int written = 0;
            int temp = s;
            
            // 커피 마신 후 반복
            while (temp > 0) {
                written += temp;
                temp = temp / d;
            }

            if (written >= n) {
                answer = s;
                break;
            }
        }

        System.out.println(answer);  // 결과: 7
    }
}