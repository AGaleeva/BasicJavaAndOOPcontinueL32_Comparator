package arrays.utils;

import java.util.Comparator;
import java.util.function.Predicate;

public class ArrayTools {
    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("====================================================");
    }

    public static int search(Object[] arr, Object value) { // это не работает с примитивами, для них для каждого надо перегружать метод
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public static <T> T findByPredicat(T[] arr, Predicate<T> predicate) {
        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(arr[i])) {
                return arr[i];
            }
        }
        return null;
    }

  /*  public static void bubbleSort(Integer[] arr) {  // этот метод годится только для чисел, ниже универсальный метод
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++)
                if (arr[j] - arr[j + 1] > 0) {
                    Integer t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
        }
    }*/

    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++)
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
        }
    }

    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++)
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
        }
    }
}
