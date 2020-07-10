import java.util.Scanner;

public class SelectionSorting {
    public static void main(String[] agr)
    {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int j=0;j<n-1;j++)
        {
            int minInd=j;
            for(int k=j;k<n;k++)
            {
                if(arr[k]<arr[minInd])
                {
                    minInd=k;
                }
            }
//            arr[j]=arr[j]+arr[minInd];
//            arr[minInd]=arr[j]-arr[minInd];
//            arr[j]=arr[j]-arr[minInd];
            int temp=arr[j];
            arr[j]=arr[minInd];
            arr[minInd]=temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
