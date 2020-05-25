package cc.xiayang.algorithm.leecode.exercise1;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiayang@panda-fintech.com
 * @title: ContainsDuplicate
 * @copyright: Copyright (c) 2018
 * @description: <br>
 * @company: panda-fintech
 * @created on 5/25/20 6:15 PM
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicateBad2(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicateBad(int[] nums) {
        boolean flag = false;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                flag = true;
                break;
            } else {
                set.add(nums[i]);
            }
        }
        return flag;
    }

    public static boolean containsDuplicateBad2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return !(set.size() == nums.length);
    }
}
