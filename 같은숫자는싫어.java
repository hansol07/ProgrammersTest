import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
  ArrayList<Integer> num = new ArrayList<>();
        int count = 0 ;
        for(int i = 0 ; i<arr.length; i ++){
            if(i==0){
            num.add(arr[0]);
                count++;
            }
           if(i!=arr.length-1){
               if(arr[i] != arr[i+1]){
                  num.add(arr[i+1]);
                   count++;
               }
           }

        }
            int[] answer = new int[count];
            for(int i = 0 ; i<num.size() ; i++){
            answer[i]= num.get(i);
            }
        return answer;
    }
}