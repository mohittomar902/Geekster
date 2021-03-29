package weeklyContest3;

import java.util.Scanner;

public class CountDivorce6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int r=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        for(int j=i;j<=r;j++){
            if(j%k==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
