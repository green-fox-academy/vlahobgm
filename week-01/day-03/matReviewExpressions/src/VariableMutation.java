public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a+=10;
        System.out.println(a);

        int b = 100;
        b-=7;
        System.out.println(b);

        int c = 44;
        c = c * 2;
        System.out.println(c);

        int d = 125;
        d = d / 5;
        System.out.println(d);

        int e = 8;
        e = e * e* e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean fNumber = f1 > f2;
        System.out.println(fNumber);

        int g1 = 350;
        int g2 = 200;
        boolean gNumber = (g2 * 2) > g1;
        System.out.println(gNumber);

        int h = 135798745;
        boolean hDivisor = (h % 11) == 0;
        System.out.println(hDivisor);

        int i1 = 10;
        int i2 = 3;
        boolean iNumber = (boolean)(i1 > i2*i2 && i1 < i2*i2*i2);
        System.out.println(iNumber);

        int j = 1521;
        boolean jNumber = j % 3 == 0 || j % 5 == 0;
        System.out.println(jNumber);
    }
}
