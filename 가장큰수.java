import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        boolean flag = true;
        String[] str = new String[numbers.length];
        for(int i  = 0 ;i<str.length;i++){
            str[i]=Integer.toString(numbers[i]);
            if(numbers[i]!=0)flag=false;
        }
        Arrays.sort(str,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return (o2+o1).compareTo(o1+o2);
            }
        });
        if(flag){
            answer="0";
        }else{
        for(int i = 0 ; i<str.length;i++){
            answer += str[i];
        }
        }

        return answer;
    }
}
