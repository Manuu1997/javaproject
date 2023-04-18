import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Days {
    public static void main(String args[]) throws IOException
    {
        //user input
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the day of a week ");
        int ch=Integer.parseInt(br.readLine());
        switch (ch)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("wrong number choicen");
        }
    }
}
