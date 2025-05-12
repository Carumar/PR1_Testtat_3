
public class Vector {

    public static void scalarMultiplication(int[] vector, int scalar) {
        for (int i = 0; i < vector.length; i++) {

            vector[i] *= scalar;
        }
    }

    public static void vectorProduct(int[] vector1, int[] vector2) {

        if (vector1.length == vector2.length && vector2.length == 3) {
            int[] kreuzVektor3D = new int[3];
            kreuzVektor3D[0] = (vector1[1] * vector2[2]) - (vector1[2] * vector2[1]);
            kreuzVektor3D[1] = (vector1[2] * vector2[0]) - (vector1[0] * vector2[2]);
            kreuzVektor3D[2] = (vector1[0] * vector2[1]) - (vector1[1] * vector2[0]);
            System.out.println("Ergebnis des Kreuzproduktes: [" + kreuzVektor3D[0] + ", " + kreuzVektor3D[1] + ", "
                    + kreuzVektor3D[2] + "]");

        }

        else if (vector1.length == vector2.length && vector2.length == 2) {
            int kreuzVektor2D = 0;
            kreuzVektor2D = (vector1[0] * vector2[1]) - (vector1[1] * vector2[0]);
            System.out.println("Ergebnis des Kreuzproduktes: " + kreuzVektor2D);

        }

        else {
            System.out.println("Wegen unterschiedlichen Dimensionen ist das Kreuzprodukt nicht erlaubt");
        }

    }

    public static double vectorLength(int[] vector) {
        double qSumme = 0.0;
        double betrag = 0.0;
        for (int i=0; i<vector.length;i++){
            qSumme = qSumme + (vector[i]*vector[i]);
            
        }
        betrag = Math.sqrt(qSumme);

        return betrag;

    }

    public static int[][] matrixMultiplication(int[][] matrix, int scalar) {
        int[][] ausgabe = null;
        boolean matrixFlag = false;
        if (matrix.length ==3 && matrix[0].length == 3 && matrix[1].length == 3 && matrix[2].length == 3){
            matrixFlag =true;    
        }
        if (matrixFlag) {
            ausgabe = new int[3][3];
            for (int i=0; i<matrix.length;i++){
                for (int j=0; j<matrix[i].length;j++){
                    ausgabe[i][j] = matrix[i][j] * scalar;
                }
            }
        }

        return ausgabe;
    }

    public static void main(String[] args) {
        int[] vector = { 2, 4, 7 };
        int scalar = 3;
        scalarMultiplication(vector, scalar);
        System.out.println(vector[0] + " " + vector[1] + " " + vector[2]);

        int[] vector1 = { 2, 5, 1 };
        int[] vector2 = { 4, 7, 2 };

        vectorProduct(vector1, vector2);

        int[] vector3 = { 2, 5 };
        int[] vector4 = { 4, 7 };

        vectorProduct(vector3, vector4);
    }

}