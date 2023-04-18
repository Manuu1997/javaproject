import java.util.*;
public class Lal
{
        public static void main(String args[])
        {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Any Number");
            n = sc.nextInt();
            if (n>=0 && n<=9)
            {
                System.out.println("One Digit Number");
            }
            else if (n>=10 && n<=99)
            {
                System.out.println("Two Digit Number");
            }
            else if (n>=100 && n<=999)
            {
                System.out.println("Three Digit Number");
            }
            else
                System.out.println("More Than Three Digit Number");
        }
    }


