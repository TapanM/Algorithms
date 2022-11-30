public class BubbleSort{
    
    void bubbleSort(int[] arr, int n){
        for (int i = 0; i < n-1; i++) { //after every pass, last element will be in correct position
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        int[] arr = {5, 1, 4, 2, 8};
        b.bubbleSort(arr, arr.length);
        b.printArray(arr);
    }
}

/*
 * 5 , 1, 4,  2,   8
 *            ^    ^
 *          i,j   j+1
 */


