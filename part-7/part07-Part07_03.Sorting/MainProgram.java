import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        // int[] array = { 3, 1, 5, 99, 3, 12 };
        int[] array = { 6, 3, 0, -1, 4 };
        // int[] numbers = { -1, 6, 9, 8, 12 };

        // System.out.println("Smallest: " + MainProgram.smallest(array));
        // System.out.println("Index of smallest: " +
        // MainProgram.indexOfSmallest(array));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
        MainProgram.sort(array);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestIndex = 0;
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex;
        int smallest = table[startIndex];
        for (int i = startIndex + 1; i < table.length; i++) {
            if (smallest > table[i]) {
                smallest = table[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int number1 = array[index1];
        array[index1] = array[index2];
        array[index2] = number1;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }

}
