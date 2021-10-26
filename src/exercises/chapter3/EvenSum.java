package exercises.chapter3;

import java.util.ArrayList;

public class EvenSum {
    public static Integer findSum(ArrayList<Integer> arr){
        Integer total = 0;
        for(Integer num: arr){
            if(num%2 == 1){
                total += num;
            }
        }
        return total;
    }
}
