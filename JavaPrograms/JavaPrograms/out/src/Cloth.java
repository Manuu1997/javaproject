import java.util.*;
public class Cloth
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total cost: ");
        double cost = in.nextDouble();
        double amt;

        if (cost < 2000)
        {
            amt = cost - (cost * 5 / 100.0);
        }
        else if (cost < 5000)
        {
            amt = cost - ( cost * 25 / 100.0);
        }
        else if ( cost < 10000)
        {
            amt = cost - ( cost * 35 / 100.0);
        }
        else
        {
            amt = cost - ( cost * 50 / 100.0);
        }
        System.out.println("Amount to be paid : " + amt);
    }
}

