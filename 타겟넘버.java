class Solution {
    static int answer = 0 ;
    public void DFS(int L, int sum, int[] numbers, int target,int s){
        if(L==numbers.length){
            if(sum==target){
                answer++;
            }
        }else{
            for(int i =s ;i<numbers.length;i++){
                DFS(L+1,sum+numbers[i],numbers,target,i+1);
                DFS(L+1,sum-numbers[i],numbers,target,i+1);
            }
          
        }
        
    }
    public int solution(int[] numbers, int target) {
        Solution so = new Solution();
        so.DFS(0,0,numbers,target,0);
        return answer;
    }
}
