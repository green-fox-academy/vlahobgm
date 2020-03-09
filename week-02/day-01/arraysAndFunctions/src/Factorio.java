public class Factorio {
    public static void main(String[] args) {
        int number = 5;
        int factNumber = factorio(number);

        System.out.println(factNumber);
    }
    public static int factorio(int n) {
        if (n != 0) {
            return (n * factorio(n - 1));
        }else {
            return 1;
        }
    }
}
