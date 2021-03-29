package weeklyContest7;

import java.util.Scanner;

public class NearestSmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print( "-1 ");


        for (int i = 1; i < n; i++)
        {
            int j;
            for(j = i - 1; j >= 0; j--)
            {
                if (arr[j] < arr[i])
                {
                    System.out.print(arr[j]+" ");
                    break;
                }
            }

            if (j == -1)
                System.out.print( "-1 ") ;
        }

    }


}
