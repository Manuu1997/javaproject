public class reverse1
{
    public static void main(String args[])
    {
        String str="java",nstr="";
        char ch;
        System.out.println("java");
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println("reverse word " + nstr);
    }
}
