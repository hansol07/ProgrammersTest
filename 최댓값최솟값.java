import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] ar=s.split(" ");
        int[] ans = new int[ar.length];
        for(int i = 0 ; i<ar.length; i++){
            ans[i] = Integer.parseInt(ar[i]);
        }
        Arrays.sort(ans);
        answer = ans[0]+" "+ans[ar.length-1];
        return answer;
    }
}
