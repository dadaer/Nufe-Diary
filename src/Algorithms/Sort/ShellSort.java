package Algorithms.Sort;

/**
 * 插入排序的改进版，对于大规模的数组，插入排序只能交换相邻的元素，速度很慢。
 * 希尔排序使用插入排序对间隔h的序列进行排序。通过不断减小就h，最后令h=1，就可以使得整个数组是有序的。
 *
 * @param <T>
 */
public class ShellSort<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        int h = 1;
        while (h < N) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j < N && less(nums[j], nums[j - h]); j -= h) {
                    swap(nums, j, j - h);
                }
            }
            h = h / 3;
        }
    }
}
