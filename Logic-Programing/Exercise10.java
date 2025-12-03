package MatricesRevision;

public class Exercise10 {
    static void main(String[] args) {
        // Transforme linhas em colunas (matriz transposta).

        System.out.println("Transformando em uma matrix transposta [3x2 = 2x3]");

        byte [][] matrix = {{1,2}, {3,4}, {5,6}};
        byte [][] transposedMatrix = new byte[2][3];

        // Pega linhas
        for (int row = 0; row < matrix.length; row += 1) {
            for (int col = 0; col < matrix[row].length; col += 1) {
                // Inverte os valores
                transposedMatrix[col][row] = matrix[row][col];
            }
        }

        for (int index = 0; index < transposedMatrix.length; index += 1) {
            for (int i = 0; i < transposedMatrix[index].length; i += 1) {
                System.out.print(transposedMatrix[index][i]);
            }
            System.out.println();
        }
    }
}
