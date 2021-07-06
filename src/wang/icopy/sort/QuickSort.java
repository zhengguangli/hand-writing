package wang.icopy.sort;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 7, 5, 3, 2, 4, 1, 8, 9, 6 };

        int low = 0;
        int high = arr.length - 1;

        quickSort(arr, low, high);

        for (int i : arr) {
            System.out.println(i);
        }

    }

    static void quickSort(int[] arr, int low, int high) {

        // 如果指针在同一个位置时(只有一个数据)退出
        if (high - low < 1) {
            return;
        }

        // 记录的指针位置
        int start = low;
        int end = high;

        // 标记，从高指针开始还是低指针(默认高指针)
        boolean flag = true;

        // 默认中间值为第一个值
        int midValue = arr[low];
        while (true) {

            // 高指针移动
            if (flag) {
                // 如果列表右方数据大于中间值，则向左移动
                if (arr[high] > midValue) {
                    high--;
                } else if (arr[high] < midValue) {
                    // 如果小于，则覆盖低值，并移动指针，标识位改成从低指针移动
                    arr[low] = arr[high];
                    low++;
                    flag = false;
                }
            } else {
                // 如果低值针数据小于中间值，则低指针向右移动
                if (arr[low] < midValue) {
                    low++;
                } else if (arr[low] > midValue) {
                    // 如果低指针数据大于中间值，则覆盖高指针停留时的数据，并向左移动高指针。标志切换为高指针移动
                    arr[high] = arr[low];
                    high--;
                    flag = true;
                }
            }

            // 当两个指针位置相同时，则找到了中间位置，并退出循环
            if (low == high) {
                arr[low] = midValue;
                break;
            }

        }

        // 然后出现有，中间值左边小于中间值。右边大于中间值
        // 然后再对左右两边的列表进行快速排序
        quickSort(arr, start, low - 1);
        quickSort(arr, low + 1, end);
    }
}
