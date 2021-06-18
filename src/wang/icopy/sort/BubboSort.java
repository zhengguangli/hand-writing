package wang.icopy.sort;

public class BubboSort {

    public static void main(String[] args) {
        int[] array = { 8, 3, 2, 6, 7, 1 };

        bubboSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * 冒泡排序
     * 
     * @param array 为排序数组
     */
    static void bubboSort(int[] array) {
        boolean sort = true;
        int index = array.length - 1;
        while (sort) {
            sort = false;
            for (int i = 0; i < index; i++) {
                if (array[i] > array[i + 1]) {
                    sort = true;
                    int tmp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tmp;
                }
            }
            --index;
        }
    }
}
