package org.example.arrays;

/**
 * The type Container with most water.
 * {@link https://leetcode.com/problems/container-with-most-water/}
 */
public class ContainerWithMostWater {
    /**
     * Max area int.
     *
     * @param height the height
     * @return the int
     */
    public int maxArea(int[] height) {

        int start = 0 ;
        int end = height.length-1;
        int max=0;
        int area=0;

        while(start<end){
            area = (end-start)*findMin(height[start],height[end]);
            max = findMax(max,area);
            if(height[start]<height[end]){
                start++;
            }else {
                end--;
            }
        }

        return max;
    }

    /**
     * Find min int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public int findMin(int a, int b){
        return a<b ? a:b;
    }

    /**
     * Find max int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public int findMax(int a, int b){
        return a>b ? a:b;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(new ContainerWithMostWater().maxArea(arr));
    }
}
