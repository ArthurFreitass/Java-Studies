package MatricesRevision;

/**
 * 4) Soma da diagonal principal
 * Some os elementos da diagonal principal de uma matriz 3×3.
 */

public class Exercise4 {
    public static void main (String[] args) {
        System.out.println("SOMA DE TODOS OS ELEMENTOS DE UMA MATRIX [3x3]");
        System.out.println("----------------------------------------------");

        int [][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};

        byte sum = 0;

        sum += matrix[0][0];
        sum += matrix[1][1];
        sum += matrix[2][2];

        System.out.println("A soma de todos os elementos da matriz é: "+ sum);
    }
}
