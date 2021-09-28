import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 8, 4, 2, 9};
        System.out.println("Numbers without sort: " + Arrays.toString(numbers));
        shellSort(numbers);
        System.out.println("Numbers sorted: " + Arrays.toString(numbers));

    }

    public static void shellSort(int[] matrix){
        for (int increment = matrix.length / 2; increment > 0;
             increment = (increment == 2 ? 1 : (int) Math.round(increment / 2.2))){
            for (int i = increment; i < matrix.length; i++){
                for (int j = i; j >= increment && matrix[j - increment] > matrix[j]; j -= increment){
                    int temp = matrix[j];
                    matrix[j] = matrix[j - increment];
                    matrix[j - increment] = temp;
                }
            }
        }
    }

}
