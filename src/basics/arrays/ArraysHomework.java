package basics.arrays;

/**
 * Created by Kostya on 14.12.2016.
 */
public class ArraysHomework {
    public static void main(String[] args) {
        int[] mas = {4, 3, 6, 12, 1, 8};
        System.out.print("Mas: ");
        for (int e : mas) {
            System.out.print(e + " ");
        }

        System.out.println();
        System.out.println("Max = " + max(mas));
        System.out.println("Min = " + min(mas));
        System.out.println("Average = " + average(mas));
        System.out.println("Reverse mas:");
        reverse(mas);
        for (int e : mas) {
            System.out.print(e + " ");
        }
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int e : array) {
            sum += e;
        }
        return sum / array.length;
    }

    public static int[] reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
