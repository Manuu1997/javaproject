public class SumSeries
{
    public static void main(String args[])
    {
        int sum = 0;
        for (int i = 1; i <= 10; i++)
        {
            int p = 1;
            for (int j = 1; j <= i; j++)
                p *= j;
            sum += p;
        }
        System.out.println("Sum = " + sum);
    }
}
