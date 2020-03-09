public class Sum {
    public static void main(String[] args) {
    int numberToZero = 5;
    int sumNum = sum(numberToZero);
        System.out.println(sumNum);

    }
    public static int sum(int a){
        if (a != 0) {
            return a + sum(a - 1);
        }
        else {
            return a;
        }
    }
}
