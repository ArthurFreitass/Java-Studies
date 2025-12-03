package MatricesRevision;

/**
 * Multiplique todos os elementos de uma matriz 3×3 por um mesmo número.
 */
public class Exercise9 {
    public static void main(String[] args) {
        System.out.println("Multiplicando todos os elementos de uma matriz [3x3] por 2");
        System.out.println("==========================================================\n");

        int [][] matrix = {{101, 102, 103}, {201, 202, 203}, {1001, 1002, 1003}};

        for (int index = 0; index < matrix.length; index += 1) {
            for (int j = 0; j < matrix[index].length; j += 1) {
                matrix[index][j] *= 2;
            }
        }
        System.out.print("Resultado:\n");
        for (int index = 0; index < matrix.length; index++) {
            for (int j = 0; j < matrix[index].length; j += 1) {
                System.out.println(matrix[index][j]);
            }
            System.out.println();
        }
    }
}
