package Algorithms.Sort;

/**
 * 冒泡排序
 * 从左到右不断交换相邻的元素，在一轮的循环之后，可以让未排序的最大元素上浮到右侧；
 * @param <T>
 */
public class BubbleSort<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        boolean hasSorted = false;
        for (int i = N; i > 0 && !hasSorted; i--) {
            hasSorted = true;
            for (int j = 0; j < i; j++) {
                if (less(nums[j], nums[j + 1])) {
                    hasSorted = false;
                    swap(nums, j, j + 1);
                }
            }
        }
    }
}
