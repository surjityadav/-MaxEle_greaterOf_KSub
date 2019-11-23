
import java.util.Scanner;


public class MaxEle_greaterOf_KSub {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        System.out.println("Enter the value of K");
        int k=sc.nextInt();
        System.out.println("Enter the elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int max=0;
                for(int l=i;l<=j;l++)
                {
                    if(max<a[l])
                    {
                        max=a[l];
                    }
                }
                if(max>k)
                {
                    count++;
                }
            }
        }
        System.out.println("Greater then K Subarray element count :"+ count);
    }
}
