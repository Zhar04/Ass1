package Matrix;

public class Main {
    public static void main(String[] args) {
        int number=5;
        int[][] example = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] example2={
                {9,8,7},
                {6,5,4},
                {3,2,1}
        };
        Matrix Matrix= new Matrix(example);
        Matrix Matrix2=new Matrix(example2);
        Matrix addresult= Matrix.add(Matrix2);

        int[][] retMatrix= Matrix.getmatrix();
        Matrix.printmatrix();
        Matrix2.printmatrix();
        addresult.printmatrix();
        Matrix.multiplybynumber(number);

    }

}