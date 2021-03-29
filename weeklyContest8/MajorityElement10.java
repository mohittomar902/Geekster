package weeklyContest8;

import java.util.Scanner;

public class MajorityElement10 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]  arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxCount = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            if (count >= maxCount) {
                maxCount = count;
                index = i;
            }
        }

        if (maxCount >= n / 2){
            System.out.println(arr[index]);
        }
        else
        {   System.out.println("NO MAJORITY ELEMENT");
        }


    }

}
