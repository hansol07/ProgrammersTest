import java.util.*;
class Solution {
    static int total=0;
    public int solution(int[] histogram) {
        int answer = -1;
       
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i = 0 ; i<histogram.length-2;i++){
            for(int j= i+2 ; j<histogram.length;j++){
             total=Math.max(Math.min(histogram[i],histogram[j])*(j-1),total);
            }
            
        }
        answer= total;
        return answer;
    }
}
