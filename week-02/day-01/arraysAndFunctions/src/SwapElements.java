public class SwapElements {
    public static void main(String[] args) {
        String [] orders = {"first", "second", "third"};
        String [] swapTemp = new String[3];
        swapTemp[0] = orders[2];
        swapTemp[2] = orders[0];
        swapTemp[1] = orders[1];

        orders = swapTemp;

        for (int i = 0; i < orders.length ; i++) {
            System.out.print(orders[i] + " ");
        }
    }
}
