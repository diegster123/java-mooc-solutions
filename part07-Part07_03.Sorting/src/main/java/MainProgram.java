
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int start = array[0];
        for (int i = 0; i < array.length; i++) {
            if (start > array[i]) {
                start = array[i];
            }
        }
        return start;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[smallest] > array[i]) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        for (int i = startIndex; i < table.length; i++) {
            if (table[startIndex] > table[i]) {
                startIndex = i;
            }
        }
        return startIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1]; 
        array[index1] = array[index2]; 
        array[index2] = temp; 
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestValue = indexOfSmallestFrom(array, i);
            System.out.println(Arrays.toString(array));
            swap(array, i, smallestValue);
        }
    }
}
