import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
      
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            if(arr[i]%divisor ==0){
                ans.add(arr[i]);
            }
        }
        Collections.sort(ans);
        if(ans.size()>0){
                int[] answer = new int[ans.size()];
        for(int i = 0 ;i< ans.size();i++){
            answer[i]=ans.get(i);
            
        }
                return answer;
        }else{
            int[] answer= new int[1];
            answer[0]=-1;
            return answer;
        }

    }
}
