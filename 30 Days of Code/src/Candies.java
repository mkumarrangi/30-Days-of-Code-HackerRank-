import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Candies {
    public static void main(String[] ag)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        int arr[]=new int[n];
        Arrays.fill(arr,1);
        for(int i=1;i<n-1;i++)
        {
            if(a[i-1]<a[i])
            {
                arr[i]=arr[i-1]+1;
            }
        }
       for(int i=n-2;i<=0;i--)
       {
           if(a[i]>a[i+1])
           {
               arr[i]=Math.max(arr[i+1]+1,arr[i]);
           }
       }
       int sum=0;
        for (int i=0;i<n;i++
             ) {
            sum=sum+arr[i];

        }
        System.out.println(sum);
    }
}
