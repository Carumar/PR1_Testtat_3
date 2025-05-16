import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VectorTest {

    @Test
    void testScalarMultiplication() {
        int[] vector = {1, 2, 3};
        int scalar = 2;
        Vector.scalarMultiplication(vector, scalar);
        assertArrayEquals(new int[]{2, 4, 6}, vector);
        int[] vector1 = {7, 8, 15};

        Vector.scalarMultiplication(vector1, -1);
        assertArrayEquals(new int[]{-7, -8, -15}, vector1);
    }

    @Test
    void testVectorProduct2D() {
        int[] vector1 = {3, 4};
        int[] vector2 = {5, 6};
        // Für 2D Kreuzprodukt wird der Skalarwert (Z-Komponente des 3D-Kreuzprodukts) verwendet
        // 3*6 - 4*5 = 18 - 20 = -2
        // Erwartete Ausgabe: -2
        System.out.print("Erwartete Ausgabe: -2\nTatsächliche Ausgabe: ");
        Vector.vectorProduct(vector1, vector2);
    }

    @Test
    void testVectorProduct3D() {
        int[] vector1 = {1, 2, 3};
        int[] vector2 = {4, 5, 6};
        // Kreuzprodukt:
        // x = 2*6 - 3*5 = 12 - 15 = -3
        // y = 3*4 - 1*6 = 12 - 6 = 6
        // z = 1*5 - 2*4 = 5 - 8 = -3
        System.out.print("Erwartete Ausgabe: [-3, 6, -3]\nTatsächliche Ausgabe: ");
        Vector.vectorProduct(vector1, vector2);
    }

    @Test
    void testVectorLength() {
        int[] vector = {3, 4};
        double length = Vector.vectorLength(vector);
        assertEquals(5.0, length, 0.001);

        int[] vector3D = {1, 2, 2};
        assertEquals(3.0, Vector.vectorLength(vector3D), 0.001);
    }

    @Test
    void testMatrixMultiplicationValidMatrix() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int scalar = 2;
        int[][] expected = {
            {2, 4, 6},
            {8, 10, 12},
            {14, 16, 18}
        };
        assertArrayEquals(expected, Vector.matrixMultiplication(matrix, scalar));
    }

    @Test
    void testMatrixMultiplicationInvalidMatrix() {
        int[][] invalidMatrix = {
            {1, 2},
            {3, 4}
        };
        assertNull(Vector.matrixMultiplication(invalidMatrix, 3));
    }
}