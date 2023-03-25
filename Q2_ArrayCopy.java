import java.util.Scanner;
public class Q2_ArrayCopy
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter number of elements:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int destination[]=new int[n];
        for(int i=0;i<n;i++)
        {
            destination[i]=arr[i];
        }

        System.out.println("Copy of original array");
        for(int i=0;i<n;i++)
        {
            System.out.print(destination[i]+" ");
        }
    }
}
