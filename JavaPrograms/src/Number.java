import java.util.*;
public class Number
{
     public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int arr[]=new int[6];
            System.out.print("Enter 6 array elements: ");
            for(int i=0;i<arr.length;i++)
                arr[i]=sc.nextInt();
            System.out.println("Entered Array: ");
            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+ " ");
            int min=arr[0],max=arr[0];
            for(int i=0;i<arr.length;i++)
            {
                if(min>arr[i])
                    min=arr[i];
                if(max<arr[i])
                    max=arr[i];
            }
            System.out.println("\nMaximum is : "+max);
            System.out.println("Minimum is : "+min);
        }
}

