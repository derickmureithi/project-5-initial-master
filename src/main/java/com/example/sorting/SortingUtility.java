package com.example.sorting;

public class SortingUtility {

    // Part A Gnome Sort Algorithm
    public static <T extends Comparable<T>> void gnomeSort(T[] data) {
        int pos = 0;
        while (pos < data.length) {
            // If at the beginning of the array or the current element is greater or equal to the previous element
            if (pos == 0 || data[pos].compareTo(data[pos - 1]) >= 0) {
                pos = pos + 1; // Move the position to the right
            } else {
                swap(data, pos, pos - 1); // Swap the current element with the previous element
                pos = pos - 1; // Move the position to the left
            }
        }
    }

    // Part B Optimized Gnome Sort Algorithm
    public static <T extends Comparable<T>> void gnomierSort(T[] data) {
        for (int pos = 1; pos < data.length; pos++) {
            gnomierSort(data, pos); // Call the recursive method for each position
        }
    }

    // Part C Optimized Gnome Sort Algorithm (recursive)
    private static <T extends Comparable<T>> void gnomierSort(T[] data, int upperBound) {
        int pos = upperBound;
        while (pos > 0 && data[pos - 1].compareTo(data[pos]) > 0) {
            swap(data, pos - 1, pos); // Swap the current element with the previous element
            pos = pos - 1; // Move the position to the left
        }
    }

    // Helper method to swap elements at index1 and index2 in the data array
    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {
        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
}
