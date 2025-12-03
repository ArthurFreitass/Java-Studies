package MatricesRevision;

public class Exercise1 {
    public static void main(String[] args) {
        /**
         * Dada uma matriz 3×3, exiba cada elemento na tela.
         */

        int [][] matrix = { {23, 34, 67}, {19, 13, 11}, {92, 59, 2} };

        System.out.println("Exibindo cada elemento da matriz:");

        for (int index = 0; index < matrix.length; index += 1) {
            // Loop percorre a linha
            for (int i = 0; i < matrix[index].length; i += 1) {
                // Loop percorre a coluna
                System.out.println(matrix[index][i]+ "\t");
            }
            System.out.println();
        }
    }
}
