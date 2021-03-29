package weeklyContest2;

import java.util.Scanner;

public class DevidedSequance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();


        a--;
        int b = ((1+a/2)%2);

        System.out.println(b);

    }
}
