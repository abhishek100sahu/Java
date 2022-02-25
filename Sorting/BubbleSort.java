package Sorting;

public class BubbleSort {
    public static void printArray(int arr[]) {
        for (int element : arr) {
            System.out.print(element+" ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {6, 5, 8, 7, 9, 3, 1, 2};
//        Time Complexity = O(n^2)
        // Bubble short
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
}
