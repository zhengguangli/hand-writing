package wang.icopy.sort;

public class InsertSort {
    public static void main(String[] args) {
        int arr[] = { 7, 6, 5, 3, 2, 4 };

        insertSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 插入排序
     * 
     * @param arr
     */
    private static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
    }
}