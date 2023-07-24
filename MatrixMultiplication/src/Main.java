public class Main {
    public static void main(String[] args) {
        Matrix mat1 = new Matrix(2,4);
        mat1.generate(0, 4);
        mat1.printMatrix();

        System.out.println("-----------------");

        Matrix mat2 = new Matrix(4,2);
        mat2.generate(0, 4);
        mat2.printMatrix();

//        System.out.println("------add--------");
//        mat1.add(mat2).printMatrix();
//        System.out.println("-----subtract----");
//        mat1.subtract(mat2).printMatrix();
        System.out.println("-----multiply----");
        mat1.multiply(mat2).printMatrix();
    }
}