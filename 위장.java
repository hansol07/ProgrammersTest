import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i = 0 ;i< clothes.length ;i++){
            hm.put(clothes[i][1],hm.getOrDefault(clothes[i][1],0)+1);
        }
           String[] mKeys = hm.keySet().toArray(new String[hm.size()]);
            int x=1;
         int sum=0;
        if(hm.size()==1){
            answer = clothes.length;
            return answer;
        }else{


            for(int i = 0;i<mKeys.length ; i++){
                       x = x * (hm.get(mKeys[i])+1);


            }
               answer += x-1; 
        }

        return answer;
    }
}