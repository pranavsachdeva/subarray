import java.util.*;

 public class SubArray
{
      public static void main(String args[])
      {
         int n;
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of array-");
        n=sc.nextInt();
        int arr[]=new int[n];
      System.out.println("Enter elements of array-");
      
      for(int i=0;i<n;i++)
           {
                arr[i]=sc.nextInt();
            }
        

        System.out.println("Enter the value of k-");
        int k=sc.nextInt();
        

        int subArrcount=n*(n+1)/2;
        int kcount=((n-k+1)*(n-k+2))/2;
      

      System.out.println("Total number of sub arrays="+subArrcount);
      System.out.println("Available sub arrays respective of k="+kcount);


        

      }

}