import java.util.*;
public class binary{
    public static int binarySearch(int numbers[] , int target){
        int start = 0;
        int end = numbers.length-1;
         
       while(start <= end){
            int mid =(start + end)/2;

            if(numbers[mid] == target){
                return mid;
            }else if(numbers[mid] < target){
                start = mid +1;
            }else if(numbers[mid] > target) {
                end = mid -1;
            }
       }
              return -1;
    }
    public static void main(String args[]){
        int numbers[] ={2,4,6,8,12,14,16};
        int target = 8;
        int key = binarySearch(numbers,target);
        System.out.println(key);
    }

}git