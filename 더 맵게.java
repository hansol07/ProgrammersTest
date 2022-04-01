import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
      PriorityQueue<Integer> pQ = new PriorityQueue<>();

        for(int i = 0;i<scoville.length;i++){
            pQ.offer(scoville[i]);
        }
        int count=0;
        while(pQ.size()>1){
            if(pQ.peek()>=K) break;
            int num1 = pQ.poll();
               int num2 = pQ.poll();
           int a =  num1 + num2*2;
            pQ.offer(a);
            count++;
        }
        answer=count;
       if(pQ.peek()<K){
           answer = -1;
       }
        return answer;
    }
}