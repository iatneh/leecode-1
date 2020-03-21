package cc.xiayang.algorithm.leecode.exercise1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author xiayang@panda-fintech.com
 * @title: RemoveDuplicates
 * @copyright: Copyright (c) 2018
 * @description: <br>
 * @company: panda-fintech
 * @created on 2020/3/21上午11:18
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int len = removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
        }
        return nums.length;
    }
}
