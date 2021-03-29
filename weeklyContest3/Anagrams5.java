package weeklyContest3;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams5 {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        int q=sc.nextInt();

        while(q>0)
        {
            String str1=sc.next();

            String str2=sc.next();

            char[] ch1=str1.toCharArray();

            Arrays.sort(ch1);
            String sorted1 = new String(ch1);

            char[] ch2=str2.toCharArray();
            Arrays.sort(ch2);
            String sorted2 = new String(ch2);
            char ch='a';

            int count=0;

            while(ch<='z')

            {

                int i=0;

                int j=0;

                int count1=0;

                int count2=0;

                while(i<sorted1.length()){

                    if(ch==sorted1.charAt(i))

                    {
                        count1++;
                    }

                    i++;
                }
                while(j<sorted2.length()){
                    if(ch==sorted2.charAt(j))
                    {
                        count2++;
                    }
                    j++;
                }
                ch++;
                int diff=0;
                diff=Math.abs(count1-count2);

                if(diff>0)

                {
                    count=count+diff;
                }

            }

            System.out.println(count);

            q--;

        }



    }


}
