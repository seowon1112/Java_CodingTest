import java.util.*;

public class A004_Kwak_20250103 {
    public static int[] main(int[] arr,int divisor) {;
        int answer[];
        int count=0;
        int count1=0;

       for(int i=0; i<arr.length; i++){
           if(arr[i]%divisor==0){
               count++;
           }
        }
        answer = new int[count];

        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                answer[count1]=arr[i];
                count1++;
            }
        }
       Arrays.sort(answer);
       if(count==0){
           int[] noAnswer={-1};
           return noAnswer;
       }
       return answer;
    }
}
