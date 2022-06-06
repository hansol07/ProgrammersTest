import java.util.*;
class Solution {
    static int max = 0 ; 
    public void DFS(int L,int sum,int[] arr , int bud,int count){
    if(sum>bud)return;
    if(L==arr.length){
            max=Math.max(max,count);
    }else{
        DFS(L+1,sum+arr[L],arr,bud,count+1);
        DFS(L+1,sum,arr,bud,count);
    }
    }
    // 
    public int solution(int[] d, int budget) {
        int answer = 0;
        Solution s = new Solution();
        s.DFS(0,0,d,budget,0);
        answer=max;
        return answer;
    }
}
