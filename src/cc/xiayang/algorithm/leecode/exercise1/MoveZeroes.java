package cc.xiayang.algorithm.leecode.exercise1;

import java.util.Arrays;

/**
 * @author xiayang@panda-fintech.com
 * @title: MoveZeroes
 * @copyright: Copyright (c) 2018
 * @description: <br>
 * @company: panda-fintech
 * @created on 6/24/20 2:37 PM
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        nums = new int[]{0, 0, 1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                ++j;
            }
        }
        for (; j < nums.length; j++) {
            nums[j] = 0;
        }
    }

    public static void moveZeroesBad(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < len - 1; j++) {
                    nums[j] = nums[j + 1];
                    System.out.println(i + "-" + j);
                }
                nums[len - 1] = 0;
                len--;
            }
            if (nums[i] == 0) {
                i--;
            }
        }
    }
}
