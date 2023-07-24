import java.util.Arrays;
import java.util.Random;

public class Matrix {

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }
//    public Matrix(int size) {
//        super Matrix(size, size);
//    }

    private int[][] matrix;
    private int rows;
    private int cols;

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    private int drawInt(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    public int[][] generate(int min, int max){
        if (rows < 1 || cols < 1 ) throw new IllegalArgumentException("Matrix must have size at least 1x1");
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = drawInt(min, max);
            }
        }
        matrix = mat;
        return mat;
    }

    public boolean equalSize(Matrix matrix){
        return (this.rows == matrix.rows && this.cols == matrix.cols);
    }

    public boolean compatible(Matrix matrix){
        return (this.cols == matrix.rows);
    }

    public Matrix add(Matrix matrix2) {
        if (!this.equalSize(matrix2)) throw new UnsupportedOperationException("Matrices must have equal size to add them");
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = this.matrix[i][j] + matrix2.getMatrix()[i][j];
            }
        }
        Matrix mat = new Matrix(rows, cols);
        mat.setMatrix(arr);
        return mat;
    }

    public Matrix subtract(Matrix matrix2) {
        if (!this.equalSize(matrix2)) throw new UnsupportedOperationException("Matrices must have equal size to subtract them");
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = this.matrix[i][j] - matrix2.getMatrix()[i][j];
            }
        }
        Matrix mat = new Matrix(rows, cols);
        mat.setMatrix(arr);
        return mat;
    }

    public Matrix multiply(Matrix matrix2) {
        if (!this.compatible(matrix2)) throw new UnsupportedOperationException("The sizes of the matrices are not compatible for multiplication");
        int[][] arr = new int[this.rows][matrix2.cols];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < matrix2.cols; j++) {
                int val = 0;
                for (int k = 0; k < this.cols; k++) {
                    val += this.matrix[i][k] * matrix2.matrix[k][j];
                }
                arr[i][j] = val;
            }
        }
        Matrix mat = new Matrix(rows, matrix2.cols);
        mat.setMatrix(arr);
        return mat;
    }
}
