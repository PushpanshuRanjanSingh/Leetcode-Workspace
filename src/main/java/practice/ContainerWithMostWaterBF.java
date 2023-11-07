package practice;

import java.util.*;

public class ContainerWithMostWaterBF {
    public static int maxArea(int[] height) {
        Integer max = 0;
//        Map<Integer, List<Integer>> hash = new HashMap<>();
        List<Integer> ithMax = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < height.length-1; i++) {
            count=0;
            ithMax.clear();
            for (int j = i+1; j < height.length; j++) {
                count = count + 1;
                if (height[i] < height[j]) {
                    ithMax.add(count * height[i]);
                } else {
                    ithMax.add(count * height[j]);
                }
            }
            int maxFromCol = Collections.max(ithMax);
            if (max<maxFromCol) {
                max = maxFromCol;
            }
//            hash.put(i,ithMax);
        }
//        hash.forEach((key,value)-> System.out.println("key: "+key+" "+"value:"+ value));

        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}

/*
* 1,2,3,4,5,6,7,8
*
*
*
*
* */
