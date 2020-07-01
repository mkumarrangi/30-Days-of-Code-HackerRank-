
    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

        public class LetsReview {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);

            int T=scan.nextInt();
            int n=T;
            String result[][]=new String[T][2];
            for(int k=0;k<T;k++)
            {
                String str1="";
                String str2="";
                String str=scan.next();

                for(int i=0;i<str.length();i++)
                {
                    if((i+1)%2==0)
                    {
                        str1=str1+str.charAt(i);
                    }
                    else
                    {
                        str2=str2+str.charAt(i);
                    }
                }
                result[k][0]=str1;
                result[k][1]=str2;
            }
            for(int i=0;i<n;i++)
            {
                System.out.println(result[i][1]+" "+result[i][0]);
            }
        }
    }




