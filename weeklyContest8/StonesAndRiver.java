package weeklyContest8;

import java.util.Scanner;

public class StonesAndRiver {


    static  int ways(int a ,int memo[] ){
        if (a==0||a==1){
            return a;
        }
        if (memo[a]!=0){
            return memo[a];
        }

        int s= ways(a-1,memo)+ways(a-2,memo);
        memo[a]=s;
        return s;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(ways(n+1,new int[n+2]));
    }
}
