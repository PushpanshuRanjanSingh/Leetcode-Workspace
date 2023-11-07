package org.example.arrays;

import java.util.HashMap;
import java.util.Map;


/**
 * The type Two sum.
 * {@link https://leetcode.com/problems/two-sum/description/}
 */
public class TwoSum {

    /**
     * Get ints int [ ].
     *
     * @param nums   the nums
     * @param target the target
     * @return the int [ ]
     */
    public static int[] getInts(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int[] arrayList = new int[2];
        arrayList = getInts(arr, 6);
        System.out.println("[" + arrayList[0] + "," + arrayList[1] + "]");
    }

}
