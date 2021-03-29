package weeklyContest8;

import java.util.Scanner;

public class SillyMistake {



        static boolean isValid(String s,String s2){

            int m=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=s2.charAt(i)){
                    m++;
                }
            }
            if(m>1){
                return false;
            }
            return true;
        }

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            String sb=sc.nextLine();
            int count=0;
            for(int i=0;i<=str.length()-sb.length();i++){

                if(isValid(str.substring(i,i+sb.length()),sb)){
                    count++;
                }

            }
            System.out.println(count);
        }


    }
