public class MergeSort {

    public static void conquer(int[] arr, int si, int ei, int mid) {
        int[] merged = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        //Sorting the left and right sub array
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        //if left sub array has more elemnt than right element
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        //if right sub array has more elemnt than left element
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        //copy the element from merged array to main array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int[] arr, int si, int ei) {
        //Divide the element until starting idx is greter than equal to ending index
        if (si >= ei) {
            return;
        }
        // int mid = (si + ei) / 2;
        int mid = si + (ei - si)/2; //This method will not create overflow
        divide(arr, 0, mid);
        divide(arr, mid+1, ei);

        conquer(arr, si, ei, mid);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 38, 27, 3, 43, 9, 82, 10 };
        // int[] arr = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;
        divide(arr, 0, n-1);
        printArray(arr);
    }
}
