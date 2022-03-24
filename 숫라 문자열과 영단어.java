import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] eng  = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
        String rNum ="";
        String sNum="";
        for(int i = 0; i<s.length() ; i++){
            if(Character.isDigit(s.charAt(i))){
                rNum += s.charAt(i);
            }else{
                sNum +=s.charAt(i);
                if(i== s.length()-1 || Character.isDigit(s.charAt(i+1))||Arrays.asList(eng).contains(sNum)){
                    for(int j = 0 ; j<eng.length;j++){
                        if(eng[j].equals(sNum)){
                            rNum += num[j];
                            break;
                        }
                    }
                    sNum="";
                }
            }
        }
        answer=Integer.parseInt(rNum);
        return answer;
    }
}