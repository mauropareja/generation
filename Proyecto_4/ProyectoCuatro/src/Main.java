import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args)
    {

        int arr [] = new int[3];
        for (int i= 0; i < arr.length; i++){
            int randomNum = ThreadLocalRandom.current().nextInt(0, 10 + 1);
            arr[i] = randomNum;
        }

        IntegerSet integerSet = new IntegerSet(arr);

        boolean matrix [][] = integerSet.getMatrix();

        for (int i = 0;i< matrix.length ; i++){
            for (int j = 0;j< matrix[i].length; j++){
                for (int k= 0; k < arr.length; k++){
                    if(arr[i] == i && arr[j] != j){
                        matrix[i][j] = true;
                    }
                }
                System.out.println("" + matrix[i][j]"\n");
            }
            System.out.println();

        }


    }
}