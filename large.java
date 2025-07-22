import java.util.*;
public class large {

    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        for(int i = 0; i<num.length; i++){
            if(largest < num[i]){
                 largest = num[i];
          
             }
        }
        return largest;

    }
    public static void main(String args[]){
        int num[] = {2,4,6,8,10,12};
        System.out.println("Get Largest num in array" + getLargest(num));
    }
}