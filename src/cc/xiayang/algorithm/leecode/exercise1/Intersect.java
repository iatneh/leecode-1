package cc.xiayang.algorithm.leecode.exercise1;

import java.util.*;

/**
 * @author xiayang@panda-fintech.com
 * @title: Intersect
 * @copyright: Copyright (c) 2018
 * @description: <br>
 * @company: panda-fintech
 * @created on 6/24/20 10:40 AM
 */
public class Intersect {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));

        nums1 = new int[]{4, 9, 5};
        nums2 = new int[]{9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            Integer count = map.getOrDefault(nums1[i], 0);
            if (map.get(nums1[i]) != null) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            } else {
                map.put(nums1[i], 0);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.get(nums2[i]) != null) {
                map.put(nums2[i], map.get(nums2[i]) - 1);
            } else {
                map.put(nums2[i], 0);
            }
        }
        return new int[]{};
    }

    public int[] intersectBest(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                ++i;
            } else if (nums1[i] > nums2[j]) {
                ++j;
            } else {
                nums1[k++] = nums1[i++];
                ++j;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }

    public static int[] intersectBad(int[] nums1, int[] nums2) {
        List<Integer> rl = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    rl.add(nums1[i]);
                    nums2[j] = -1;
                    break;
                }
            }
        }
        int[] result = new int[rl.size()];
        for (int i = 0; i < rl.size(); i++) {
            result[i] = rl.get(i);
        }
        return result;
    }
}
