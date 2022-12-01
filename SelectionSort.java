import java.security.Principal;

public class SelectionSort{

    void selectionSort(int[] arr, int n){
        //One by one moving the boundary of unsorted array
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            //find the minimum array in unsorted array
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 35, 12,22, 11};
        SelectionSort s = new SelectionSort();
        s.selectionSort(arr, arr.length);
        s.printArray(arr);
    }
}