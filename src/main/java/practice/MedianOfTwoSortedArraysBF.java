package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianOfTwoSortedArraysBF {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.addAll(Arrays.stream(nums1).boxed().toList());
        arr.addAll(Arrays.stream(nums2).boxed().toList());
        Collections.sort(arr);
        int length = arr.size();
        if (length % 2 == 0) {
            return (arr.get(length / 2) + arr.get((length / 2) - 1)) / 2.0;
        }
        return arr.get(length / 2);
    }

    public static void main(String[] args) {
        findMedianSortedArrays(new int[]{1, 2}, new int[]{3});
    }
}