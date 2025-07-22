import java.util.*;
public class linear{
    public static int  linearSearch(int numbers[], int target){
        
        for(int i = 0; i<numbers.length; i++){
        if(numbers[i] == target){
            return i;
        }
    }
        return -1;
    }
    public static void main(String args[]){
       int numbers[] = {45 ,56, 99, 46,78,22 , 78};
       int target = 100;

       int index = linearSearch(numbers,target);
       if(index == -1){
        System.out.println("Not Found");
       }else if(index != -1){
        System.out.println("Index Found :" + index);
       }
    }
}