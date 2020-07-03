package cc.xiayang.algorithm.leecode.exercise1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xiayang@panda-fintech.com
 * @title: TwoSum
 * @copyright: Copyright (c) 2018
 * @description: <br>
 * @company: panda-fintech
 * @created on 6/28/20 11:40 AM
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 26;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> data = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int left = target - nums[i];
            if (data.containsKey(left)) {
                return new int[]{data.get(left), i};
            }
            data.put(nums[i], i);
        }
        return new int[]{};
    }
}
