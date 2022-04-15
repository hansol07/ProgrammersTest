import java.util.*;
class Solution {
    public int solution(String[] scores) {
        int answer = 0;
  

        for(int i = 0 ; i <scores.length; i ++ ){
           char[] st= scores[i].toCharArray();
           int fCnt= 0;
           int[] sum = new int[st.length];
           int aCnt = 0 ;
           double avg = 0 ;
           for(int j = 0 ; j<st.length;j++){
              
               if(st[j]=='F'){
                   sum[j]=0;
                   fCnt++;
                   if(fCnt>=2) break;
               }
                else if(st[j]=='A'){
                     sum[j]=5;
                   aCnt++;
                   
               }else if(st[j]=='B'){
                   sum[j]=4;
               }else if(st[j]=='C'){
                   sum[j]=3;
               }else if(st[j]=='D'){
                   sum[j]=2;
               }else if(st[j]=='E'){
                   sum[j]=1;
               }
           
           }
           if(fCnt<2 &&aCnt>=2) {
                       answer++;
           }
           if(fCnt<2 && aCnt<2){
               Arrays.sort(sum);
               for(int j = 1 ; j<sum.length-1;j++){
               avg += sum[j];
            
               }
    
               avg = avg / (sum.length-2);
               if(avg>=3)answer++;
           }
        }
        return answer;
    }
}
