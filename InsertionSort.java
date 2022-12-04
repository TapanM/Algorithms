public class InsertionSort {
    
    //In insertion sort we compare two element and if we find that it is wrong pos for particular element
    //then we find for correct pos for this element and we repeated this process untill we get sorted array
    void insertSort(int[] arr, int n){
        for (int i = 1; i < n; i++) {
            int key = arr[i]; //key elemnt(We have to find the correct position for this key element)
            int j = i-1;  //j variable hold the elemnt which is compared to key element
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key; //when we find correct position for key element put it on that index
        }
    }

    void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        InsertionSort in = new InsertionSort();
        in.insertSort(arr, arr.length);
        in.printArray(arr);
    }
}
