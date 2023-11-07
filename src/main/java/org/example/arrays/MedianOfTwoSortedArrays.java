package org.example.arrays;

/**
 * The type Median of two sorted arrays.
 *
 * {@link https://leetcode.com/problems/median-of-two-sorted-arrays}
 */
public class MedianOfTwoSortedArrays {
    /**
     * Find median sorted arrays double.
     *
     * @param nums1 the nums 1
     * @param nums2 the nums 2
     * @return the double
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;

        if (totalLength % 2 == 0) {
            int leftMedian = findKthElement(nums1, 0, nums2, 0, totalLength / 2);
            int rightMedian = findKthElement(nums1, 0, nums2, 0, totalLength / 2 + 1);
            return (leftMedian + rightMedian) / 2.0;
        } else {
            return findKthElement(nums1, 0, nums2, 0, totalLength / 2 + 1);
        }
    }

    private static int findKthElement(int[] nums1, int start1, int[] nums2, int start2, int k) {
        if (start1 >= nums1.length) {
            return nums2[start2 + k - 1];
        }
        if (start2 >= nums2.length) {
            return nums1[start1 + k - 1];
        }
        if (k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }

        int mid1 = start1 + k / 2 - 1 < nums1.length ? nums1[start1 + k / 2 - 1] : Integer.MAX_VALUE;
        int mid2 = start2 + k / 2 - 1 < nums2.length ? nums2[start2 + k / 2 - 1] : Integer.MAX_VALUE;

        if (mid1 < mid2) {
            return findKthElement(nums1, start1 + k / 2, nums2, start2, k - k / 2);
        } else {
            return findKthElement(nums1, start1, nums2, start2 + k / 2, k - k / 2);
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        findMedianSortedArrays(new int[]{1, 2}, new int[]{3});

    }
}
