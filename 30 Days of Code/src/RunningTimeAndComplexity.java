
    import java.io.*;
import java.util.*;

        public class RunningTimeAndComplexity {
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scan=new Scanner(System.in);
            int n;
            n=scan.nextInt();
            int ar[]=new int[n];
            for(int i=0;i<n;i++)
            {
                ar[i]=scan.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                int count=0;
                for(int j=2;j<Math.sqrt(ar[i]);j++)
                {
                    if(ar[i]%j==0)
                    {
                        count++;
                    }

                }
                if(count!=0)
                {
                    System.out.println("Not prime");
                }
                else
                {
                    System.out.println("Prime");
                }
            }
        }
    }

