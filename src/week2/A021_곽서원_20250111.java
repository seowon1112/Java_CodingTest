import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            int sum=0;

            for(int i=0; i<n; i++){

                sum+=sc.nextInt();
                if(i==0) continue;
                sum--;

            }
            System.out.println(sum);
    }
}
