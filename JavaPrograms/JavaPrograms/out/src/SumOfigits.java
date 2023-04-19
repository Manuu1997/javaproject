import java.util.Scanner;
public class SumOfigits
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        int digit;
        int sum = 0;

        while (num > 0) {
            digit = num % 10;

            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("sum of digit" + sum );
    }
}
