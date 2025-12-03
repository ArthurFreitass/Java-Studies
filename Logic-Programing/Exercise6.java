package MatricesRevision;

/**
 * Conte quantos valores pares existem em uma matriz 5×5.
 */
public class Exercise6 {
    static void main(String[] args) {
        System.out.println("Contador de números pares dentro da matrix [3x3]");

        int [][] matrix = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}};
        int sumPair = 0;

        for (int index = 0; index < matrix.length; index += 1) {
            for(int j = 0; j < matrix[index].length; j++) {
                if (matrix[index][j] % 2 == 0) {
                    sumPair += matrix[index][j];
                }
            }
        }
        String message = "A soma dos pares nessa matriz é: "+ sumPair;
        System.out.println(message);
    }
}
