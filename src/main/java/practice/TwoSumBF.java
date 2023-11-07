package practice;


class TwoSumBF {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("[" + i + "," + j + "]");
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        TwoSumBF arrayImpl = new TwoSumBF();
        int[] arr = {3,2,4};
        int[] arrayList = new int[2];
        arrayList = arrayImpl.twoSum(arr, 6);
        System.out.println("[" + arrayList[0] + "," + arrayList[1] + "]");
    }
}

