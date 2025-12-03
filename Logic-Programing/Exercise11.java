package MatricesRevision;

public class Exercise11 {
    static void main(String[] args) {
        // Verifique se uma matriz 3×3 é simétrica (A[i][j] == A[j][i])

        byte [][] matrix = {{127,23,35}, {21, 45, 7}, {11, 3, 5}};
        byte [][] tranposedMatrix = new byte[3][3];
        boolean result = true;

        while (true) {
            for (int index = 0; index < matrix.length; index += 1) {
                for (int j = 0; j < matrix[index].length; j += 1) {
                    tranposedMatrix[j][index] = matrix[index][j];
                    if (tranposedMatrix[j][index] != matrix[index][j]) {
                        result = false;
                        break;
                    }
                }
            }
            break;
        }
        if (result) {
            System.out.println("As matrizes são simétricas");
        } else
            System.out.println("As matrizes não são simétricas");
    }
}
