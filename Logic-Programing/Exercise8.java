package MatricesRevision;

/**
 * Some duas matrizes 3×3 e obtenha uma terceira matriz como resultado.
 */

import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        //Padrão
        int [][] matrixA = new int [3][3];
        int [][] matrixB = new int [3][3];
        int [][] matrixC = new int [3][3];

        //Conversão
        String [][] mA = new String [3][3];
        String [][] mB = new String [3][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAMA - MATRIZES");
        System.out.println("===================");
        System.out.println("Soma de duas matrizes, retornando uma terceira como resultado\n");

        System.out.println("Digite os valores para a primeira matriz");
        System.out.println("========================================\n");

        for (int index = 0; index < matrixA.length; index += 1) {
            for (int j = 0; j < matrixA[index].length; j += 1) {
                System.out.println("Digite um valor da linha ["+index+"] e coluna ["+j+"] da primeira matrix:");
                mA[index][j] = sc.next();
                matrixA[index][j] = Integer.parseInt(mA[index][j]);
                System.out.println();
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }

        System.out.println("Digite os valores para a segunda matriz");
        System.out.println("========================================\n");

        for (int index = 0; index < matrixB.length; index += 1) {
            for (int j = 0; j < matrixB[index].length; j += 1) {
                System.out.println("Digite um valor da linha ["+index+"] e coluna ["+j+"] da segunda matrix:");
                mB[index][j] = sc.next();
                matrixB[index][j] = Integer.parseInt(mB[index][j]);
            }
        }

        // Soma

        for (int index = 0; index < matrixC.length; index += 1) {
            for (int j = 0; j < matrixC[index].length; j += 1) {
                matrixC[index][j] = matrixA[index][j] +  matrixB[index][j];
            }
        }

        System.out.println("A soma das duas matrizes, em uma nova matriz é:");
        for (int index = 0; index < matrixC.length; index += 1) {
            for (int j = 0; j < matrixC[index].length; j += 1) {
                System.out.println(matrixC[index][j]+ "\t");
            }
            System.out.println();
        }
    }
}
