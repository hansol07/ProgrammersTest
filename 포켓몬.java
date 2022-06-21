import java.util.*;
class Solution {
    static   int[] dis;
    static int answer;
    public void DFS(int l , int[] num, ArrayList<Integer> arr){
        if(arr.size()==num.length/2)return;
        if(l==num.length){
                System.out.println(arr.size());
                  Collections.sort(arr);
            int count=1;
            for(int i =1;i<arr.size();i++){
                if(arr.get(i)!=arr.get(i-1))count++;
            }
            if(count==num.length/2)answer++;
        }else{
            for(int i =l ; i<num.length;i++){
                arr.add(num[i]);
                    System.out.println(arr.size());
                DFS(l+1,num,arr);
                arr.remove(num[i]);
                
            }

        }
    }
    public int solution(int[] nums) {
   
        dis =new int[nums.length];
        Solution s = new Solution();
        ArrayList<Integer> arr = new ArrayList<>();
        s.DFS(0,nums, arr);
        return answer;
    }
}
