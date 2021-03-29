package weeklyContest2;

import java.util.Scanner;

public class ConstructString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        String str="";
        for (int j=0;j<n;j++){
            str+=(char)('a'+(j%b));
            System.out.printf(str);
        }

    }
    }
}
