
import  java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array[] = inputArray();
        int left = 0;
        int right = array.length - 1;
        System.out.println("Преобразованный массив");
        do {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] ^= array[i + 1];
                    array[i + 1] ^= array[i];
                    array[i] ^= array[i + 1];
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    array[i] ^= array[i - 1];
                    array[i - 1] ^= array[i];
                    array[i] ^= array[i - 1];
                }
            }
            left++;
        } while (left <= right);

        System.out.println(Arrays.toString(array));
    }

    public static int[] inputArray() {
        int[] SortArr = {12, 6, 4, 3, 2, 14, 5, 25, 65, 43, 1, 23, 54, 20};


        return SortArr;
    }
}



