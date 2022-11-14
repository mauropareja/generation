public class IntegerSet {

    private int arr [] ;
    private boolean  matrix [][];


    public IntegerSet(int[] arr) {
        this.arr = arr;
        boolean matrix[][] =  new  boolean[arr.length][arr.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = false;
            }
        }
        this.matrix = matrix;
    }

    public int[] getArr() {
        return arr;
    }

    public boolean[][] getMatrix() {
        return matrix;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void setMatrix(boolean[][] matrix) {
        this.matrix = matrix;
    }

    public int unionCOnjunto (){

        return 1;

    }
    public int insercionOnjunto (){
        return 1;

    }
    public int insertElemnts (){
        return 1;

    }
    public int deleteElemnt (){
        return 1;

    }
    public String toSetString (){


        return "";

    }
    public String equalsTo (){

        return "";

    }

}
