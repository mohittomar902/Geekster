package weeklyContest3;

import java.util.Scanner;

public class MicroAndArrayUpdate1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {

            int n= sc.nextInt();

            int k = sc.nextInt();

            int arr[] = new int[n];



            for(int j=0; j<n;j++){

                arr[j]=sc.nextInt();



            }

            int min=arr[0];

            for(int j=0;j<n;j++ ){

                if(min>arr[j]){

                    min=arr[j];

                }

            }
            if(min<k) {

                System.out.println(k-min);
            }
            else
            {
                System.out.println(0);

            }



        }

    }
}
