package wang.icopy.sort;

public class CompareSort {
    public static void main(String[] args) {
        int arr[] = { 7, 6, 5, 3, 2, 4 };

        compareSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 选择排序
     * 
     * @param arr
     */
    private static void compareSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }

            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
        }
    }
}
