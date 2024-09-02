import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        List<int[]> arrList = new ArrayList();
        
        int x = 0;
            
        // 기준 값의 좌표
        if ("code".equals(ext)){
            x = 0;
        } else if ("date".equals(ext)) {
            x = 1;
        } else if ("maximum".equals(ext)){
            x = 2;
        } else {
            x = 3;
        }
        
        for(int i=0; i < data.length; i++){
            if (data[i][x] < val_ext){
                arrList.add(data[i]);
            }
        }
    
        final int base_index;
        if ("code".equals(sort_by)){
            base_index = 0;
        } else if ("date".equals(sort_by)) {
            base_index = 1;
        } else if ("maximum".equals(sort_by)){
            base_index = 2;
        } else {
            base_index = 3;
        }
        
         // 두 번째 요소(인덱스 1)를 기준으로 정렬
        Collections.sort(arrList, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[base_index], b[base_index]);
            }
        });
      
        answer = new int[arrList.size()][arrList.get(0).length];
        
        for(int i=0; i<arrList.size(); i++){
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}