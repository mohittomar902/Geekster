package weeklyContest7;

import java.util.Scanner;
import java.util.Stack;

public class PostfixToPrefixConversion {


    static boolean isOperator(char x)
    {
        switch (x) {
            case '+':
            case '-':
            case '/':
            case '*':
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        Stack<String> s = new Stack<String>();
        int length = str.length();

        for (int i = 0; i < length; i++) {

            if (isOperator(str.charAt(i))) {
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();
                String temp
                        = str.charAt(i) + op2 + op1;
                s.push(temp);
            }
            else {

                s.push(str.charAt(i) + "");
            }
        }
        String ans = "";
        for (String i : s)
            ans += i;


        System.out.println(ans);




    }
}
