public class ChangeElement {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 8, 5, 6};
        /*numbers[3] = 4;
        System.out.println(numbers[3]);*/
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] == 8){
                numbers[i] = 4;
            }
        }
        System.out.println(numbers[3]);
    }
}
