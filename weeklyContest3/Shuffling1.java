package weeklyContest3;

import java.util.Scanner;

public class Shuffling1 {


        public static void main(String args[] ) throws Exception {



            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();



            for (int j = 0; j < t; j++) {

                int n= sc.nextInt();
                int x= sc.nextInt();
                int m= sc.nextInt();
                int l,r;
                int ans=1,lower=-1,upper=-1;



                for(int i=1;i<=m;i++)

                {
                    l= sc.nextInt();
                    r= sc.nextInt();


                    if(l<=x&&x<=r&&l!=r&&lower==-1)

                    {

                        lower=l;
                        upper=r;
                    }

                    if(lower!=-1)

                    {
                        if((r>=lower&&r<=upper)||(l<=upper&&l>=lower)||(l<lower&&r>upper))
                        {
                            lower=Math.min(l,lower);
                            upper=Math.max(r,upper);

                        }
                        ans=upper-lower+1;
                    }
                }

                System.out.println(ans);
            }



        }


    }

