package Matrix;

public class Matrix {
    int rows;
    int column;

    private int[][] array;
    private int[][] array2;
    public Matrix(){};

    public Matrix(int[][] array){
        this.array=array;
        this.rows = array.length;
        this.column = array[0].length;
    }

    public int[][] getmatrix(){
        return array;
    }

    public Matrix add(Matrix othermatrix){
        int[][] otherarray=othermatrix.getmatrix();
        int[][] resultarray=new int[rows][column];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                resultarray[i][j] = array[i][j] + otherarray[i][j];
            }
        }
        return new Matrix(resultarray);
    }

    public void multiplybynumber(int a){
        for (int[] row: array){
            for(int value : row){
                System.out.print(value*a + " ");
            }
            System.out.println();
        }
    }

    public void printmatrix(){
        for (int[] row : array){
            for(int value : row){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}