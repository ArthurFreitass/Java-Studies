package MatricesRevision;

/**
 * Soma da diagonal secundária
 * Some os elementos da diagonal secundária de uma matriz 3×3.
 */

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Soma de todos os elementos da diagonal secundária");

        int [][] matrix = {
                 {1,2,3}
                ,{4,5,6}
                ,{7,8,9}
        };

        byte sum = 0;
        sum += matrix[0][2];
        sum += matrix[1][1];
        sum += matrix[2][0];

        String message = "A soma dos elementos dessa matrix [3x3] é:" + sum;
        System.out.print(message);
    }
}