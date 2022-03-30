import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
    
        ArrayList<Integer> ar = new ArrayList<>();
        Queue<Integer> qu = new LinkedList<>();
        for(int i=0;i<progresses.length;i++){
            qu.offer(progresses[i]);
        }
        int lt = 0 ;
        
        while(qu.size()>0){
            int count=0;
            
           for(int i = lt ; i< progresses.length; i++){
         
               progresses[i] +=speeds[i];
             
        }   
  
            if(progresses[lt]<100){
                continue;
            }else{
            
            for(int i = lt; i<progresses.length;i++){
                 if(progresses[i]>=100){
                       count++;
               }else{
                     break;
                 }
            }
            if(count>0){
                for(int i=0 ; i<count;i++){
                    qu.poll();
                    lt++;
                }
                ar.add(count);

            }
    
        }
        }
          int[] answer =new int[ar.size()];
        for(int i =0; i <ar.size() ;i++){
            answer[i] = ar.get(i);
        }
        return answer;
    }
}