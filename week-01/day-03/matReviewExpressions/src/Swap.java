public class Swap {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;

        int a2 = b;
        b = a;
        a = a2;

        System.out.println(a);
        System.out.println(b);
    }
}
