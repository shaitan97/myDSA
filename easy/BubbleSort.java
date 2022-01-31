package easy;

public class BubbleSort {

    public static void main(String[] args) {

        //array to be sorted
        int[] arr = {1, 3, 5, 2, 0, 4, 9, 6};

        bubbleSort(arr);

        //printing the sorted array
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    //bubble sorting method with 2 for loops
    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
