package MatricesRevision;

/**
 * Encontre o maior número dentro de uma matriz 3×4.
 */

public class Exercise3 {
    static void main(String[] args) {

        double [][] matrix = {{2.3, 1.3, 0.32, 9.1}, {12.2, 1, 4.5, 6.6}, {9.1, 0.5, 11.2, 4}};

        System.out.println("Encontrando o menor valor de uma matrix [3x4]:");
        System.out.println("==============================================\n");

        double biggestNumber = matrix[0][0];

        for (int i = 1; i < matrix.length; i += 1) {
            for (int index = 0; index < matrix[i].length; index += 1) {
                if (matrix[i][index] > biggestNumber) {
                    biggestNumber = matrix[i][index];
                }
            }
        }
        String message = "O maior número encontrado na matrix foi o: " + biggestNumber;
        System.out.println(message);
    }
}
