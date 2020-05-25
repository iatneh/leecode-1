package cc.xiayang.algorithm.leecode.exercise1;

/**
 * @author xiayang@panda-fintech.com
 * @title: SingleNumber
 * @copyright: Copyright (c) 2018
 * @description: <br>
 * @company: panda-fintech
 * @created on 5/25/20 7:03 PM
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int singleNumber = singleNumber(nums);
        System.out.println(singleNumber);
    }

    private static int singleNumber(int[] nums) {
        int len = nums.length;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            ans ^= nums[i];
        }
        return ans;
    }
}
