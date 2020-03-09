public class DiagonalMatrix {
    public static void main(String[] args) {
        int [] [] nMatrix = new int[4][4];

        for (int i = 0; i < nMatrix.length; i++) {
            for (int j = 0; j < nMatrix[i].length; j++) {
                if (i == j){
                    System.out.print(1);
                }
                else{
                    System.out.print(nMatrix[i][j]);
                }
            }
            System.out.println();
        }
    }
}
