package Algorithms.Sort;

/**
 * 每次都将当前元素插入到左侧已经排好序的数组中，使得插入之后左侧数组依然有序。
 * @param <T>
 */
public class InsertionSort<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(nums[j],nums[j - 1]); j-- ) {
                swap(nums,j,j-1);
            }
        }
    }
}
