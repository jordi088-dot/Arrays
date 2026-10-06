public class MyMatrix {
    public static void main(String[] args) {
         //Declaración
        int[][] matrix;
        //Instanciación
        matrix = new int [4][7];
        int count = 1;

        System.out.println(matrix[0].length);

        for (int fila = 0; fila < matrix.length; fila++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[fila][col] = count;
                count++;
            }
        }
        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 7; col++) {
                System.out.print(matrix[fila][col] + " ");
            }
            System.out.println();
        }
    }
}