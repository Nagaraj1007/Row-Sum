import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int[] rowSum(int[][] array){
        int rowSumArray[] = new int[array.length];
        int sum;
        for (int iterator1 = 0 ; iterator1 < array.length ; iterator1++){
            sum = 0;
            for (int iterator2 = 0 ; iterator2 < array[0].length ; iterator2++){
                sum += array[iterator1][iterator2];
            }
            rowSumArray[iterator1] = sum;
        }
        return rowSumArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rowSum(new int[][] {{1,2,3,4}, {5,6,7,8}, {9,2,3,4}})));
    }
}