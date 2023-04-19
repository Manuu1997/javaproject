public class Overloading {
    public void sub(int a, int b) {
        System.out.println(a - b);
    }

    public void sub(int a, int b, int c) {
        System.out.println(a - b - c);
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void mul(int a, int b) {
        System.out.println(a * b);
    }

    public void mul(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    public void div(int a, int b) {
        System.out.println(a / b);
    }

    public void div(int a, int b, int c) {
        System.out.println(a / b / c);
    }

    public static void main(String args[])
    {
        Overloading ol = new Overloading();
        ol.sub(25, 15, 10);
        ol.add(25, 15, 10);
        ol.mul(5, 6, 7);
        ol.div(15, 5, 3);

    }
}