import java.util.*;
import java.time.*;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
     
      LocalDate date = LocalDate.of(2016, a,b);
DayOfWeek day = date.getDayOfWeek();
        if(day.getValue()==1)answer="MON";
        else if(day.getValue()==2)answer="TUE";
          else if(day.getValue()==3)answer="WED";
          else if(day.getValue()==4)answer="THU";
          else if(day.getValue()==5)answer="FRI";
          else if(day.getValue()==6)answer="SAT";
          else if(day.getValue()==7)answer="SUN";
        else{
            answer="no";
        }
        return answer;
    }
}
