import java.util.*;

public class A010_Kwak_20250104 {
    public static void main(String []args){
        int max=0;
        String s;
        s="ab"; //aabbaccc
        for(int i=1; i<=s.length(); i++){
            String str=s.substring(0,i);
            for(int j=1; j<s.length(); j++){
                if(str.equals(str.substring(j,j+1))){

                }
            }
        }


    }
}
