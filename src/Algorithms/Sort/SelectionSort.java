package Algorithms.Sort;

/**
 * 选择排序
 * 选择数组中的最小元素，与第一个元素进行交换。再从剩下的元素找出最小的元素，将他与第二个元素进行交换。
 * 不断进行这样的操作，直到将整个数组排好序。
 *
 * @param <T>
 */
public class SelectionSort<T extends Comparable<T>> extends Sort {

    @Override
    public void sort(Comparable[] nums) {
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(nums[j], nums[min])) {
                    min = j;
                }
            }
            swap(nums, i, min);
        }
    }
}
