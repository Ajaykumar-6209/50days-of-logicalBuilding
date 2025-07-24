public class maxii {
    
    public static void printSubPreArray(int numbers[]){
     int currsum =0;
     int maxsum = Integer.MIN_VALUE;

     int prefix[] = new int[numbers.length];
   for(int i = 1; i<prefix.length; i++){
        prefix[i] = prefix[i-1] + numbers[i];
     }
     for(int i = 0; i<numbers.length; i++){
        int start =i;
        for(int j = 0; j<numbers.length; i++){
            int end = 0;
            
            currsum = start == 0? prefix[end] : prefix[end] - prefix[start-1];
             if(maxsum < currsum) {
                maxsum = currsum;
        }
    }
}     

   System.out.println(maxsum);
    
}
 public static void main(String[] args){
        int numbers[] = {1,-2,6,-1,3};
        printSubPreArray(numbers);
    }
}