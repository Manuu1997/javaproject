import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Average {
    public static void main(String args[]) throws IOException
    {
      //  int eng=55,phy=40,chem=50;
       // int avg=(eng+phy+chem)/3;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter any number");
        int eng=Integer.parseInt(br.readLine());
        int phy=Integer.parseInt(br.readLine());
        int chem=Integer.parseInt(br.readLine());
        int avg=(eng+phy+chem)/3;


        if(eng>35 && phy>35 && chem>35 && avg>40)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
