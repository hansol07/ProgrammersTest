import java.util.*;
class Solution {
    class Print{
        int seq;
        int time;
        int page;
        public Print(int seq,int time, int page){
            this.seq=seq;
            this.time = time;
            this.page = page;
        }
       
    }
    public int[] solution(int[][] data) {
        int[] answer = new int[data.length];
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Print> list = new ArrayList<>();
        int fullTime=data[0][1];
        for(int i =0;i<data.length;i++){
            list.add(new Print(data[i][0],data[i][1],data[i][2]));
            fullTime+=data[i][2];
        }
        
           PriorityQueue<Print> pq= new PriorityQueue<>(new Comparator<Print>() { 
               @Override
                public int compare(Print p1, Print p2){
                     if(p1.page<p2.page){
                         return -1;
                     }else{
                         return 1;
                     }
                      }
           });

           int s=1;
           int finishTime=list.get(0).time+list.get(0).page;
           ans.add(list.get(0).seq);
   
            int count = 1;
           
         while(ans.size()<list.size()){
        for(int i = count ; i<list.size();i++){
           if(list.get(i).time<=finishTime && !ans.contains(list.get(i).seq)&&!pq.contains(list.get(i))){
               pq.offer(list.get(i));
               System.out.println("seq "+list.get(i).seq);
                System.out.println("time "+finishTime);
           }
          }
         if(pq.isEmpty()){
            ans.add(list.get(count).seq);
            finishTime= list.get(count).time+list.get(count).page;
             count++;
         }else{
             Print p= pq.poll();
             ans.add(p.seq);
             finishTime+=p.page;
             count++;
         }
        
         }
          
  System.out.println(ans);
        for(int i = 0 ;  i<ans.size();i++){
            answer[i]=ans.get(i);
        }
     
        return answer;
    }
}
