package cc.xiayang.algorithm.leecode.exercise1;

import java.util.Arrays;

/**
 * @author xiayang@panda-fintech.com
 * @title: 删除排序数组中的重复项
 * @copyright: Copyright (c) 2018
 * @description: <pre>
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * 示例 1:
 * 给定数组 nums = [1,1,2],
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2
 * 你不需要考虑数组中超出新长度后面的元素
 *
 * 示例 2:
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * 你不需要考虑数组中超出新长度后面的元素。
 * </pre>
 * @company: panda-fintech
 * @created on 2020/3/21上午11:18
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 9, 11, 11};
        int len = removeDuplicates(nums);
        System.out.println(len + "-" + Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int len = 0;//当前去重过的下标
        for (int i = 1; i < nums.length; i++) {
            System.out.println(len + "-" + Arrays.toString(nums));
            if (nums[i] != nums[len]) {
                len++;
                nums[len] = nums[i];
            }
        }
        return len + 1;
    }

    public static int removeDuplicatesBad(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int len = 1;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                if (max < nums[i + j]) {
                    nums[i] = nums[i + j];
                    max = nums[i + j];
                    len++;
                    break;
                }
            }
        }
        return len;
    }
}
