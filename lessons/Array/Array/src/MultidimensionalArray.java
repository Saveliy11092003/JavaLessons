public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] matrice = {{1, 2, 3},
                            {4, 5},
                            {6, 7, 8, 9}};

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] table = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = i + j;
            }
        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
