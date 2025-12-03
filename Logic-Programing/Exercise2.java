package MatricesRevision;

public class Exercise2 {
    static void main(String[] args) {
        /**
         * Calcule a soma de todos os valores de uma matriz 4×4.
         */

        int matrix [][] = {
                {23, 5, 8, 9}, {221, 4, 2, 11},{127, 656, 45, 2}, {212, 565, 67, 46}
        };

        // Criando a lógica

        int sum = 0;

        for (int index = 0; index < matrix.length; index += 1) {
            for (int i = 0; i < matrix[index].length; i += 1) {
                sum += matrix[index][i];
            }
        }
        System.out.println("A soma de todos os elementos da matrix é: "+ sum);
    }
}
