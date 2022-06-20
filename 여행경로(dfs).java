import java.util.*;
class Solution {
    static ArrayList<String> arr = new ArrayList<>();

    public void DFS(String start ,  String[][] board,int[] left){
        for(int i=0; i<board.length;i++){
            if(left[i]==0&& start.equals(board[i][0])){
            
                arr.add(board[i][1]);
                left[i]=i+1;
          
                 
                
                DFS(board[i][1],board,left);
              
            }
        }
        return;
    }
    public String[] solution(String[][] tickets) {
        Solution s = new Solution();
        String[][] clone = tickets;
        int[] num = new int[tickets.length];
         Arrays.sort(clone, (o1, o2) -> {
           if(o1[0].equals(o2[0])) {
               return o1[1].compareTo(o2[1]);
           } else {
               return o1[0].compareTo(o2[0]);
           }
        });
      
        arr.add("ICN");
    
        s.DFS("ICN",clone,num);
      
        String[] answer = new String[arr.size()];
        for(int i =0; i<arr.size();i++){
            answer[i]=arr.get(i);
        }
        
        return answer;
    }
}
