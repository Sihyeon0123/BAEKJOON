// [연습문제] 추억 점수(176963)
import java.util.*;

class Solution {
	public static void main(String[] args){
        String [] name = {"may", "kein", "kain", "radi"};
        int [] yearning = {5, 10, 1, 3};
		String [][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}}
		
        int [] result = solution(name, yearning, photo);
        for(int a: result){
            System.out.println(a);
        }
    }

	public static int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
		HashMap<String, Integer> list = new HashMap<String, Integer>();
		
		for (int i = 0; i < name.length; i++)
			list.put(name[i], yearning[i]);
		
		int index = 0;
		for(String[] names: photo){
			int temp = 0;
			for(String person: names){
				// System.out.println(person);
				try{
					temp += list.get(person);
				} catch (Exception e){
					continue;
				}
			}
			answer[index++] = temp;
		}
		return answer;
	}
}