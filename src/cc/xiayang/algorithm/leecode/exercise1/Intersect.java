package cc.xiayang.algorithm.leecode.exercise1;

import java.util.*;

/**
 * @author xiayang@panda-fintech.com
 * @title: Intersect
 * @copyright: Copyright (c) 2018
 * @description: <pre>
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1：
 *
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 * 示例 2:
 *
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[4,9]
 *  
 *
 * 说明：
 *
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。
 * 我们可以不考虑输出结果的顺序。
 * 进阶：
 *
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 * </pre>
 * @company: panda-fintech
 * @created on 6/24/20 10:40 AM
 */
public class Intersect {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));

        nums1 = new int[]{4, 9, 5, 4, 4, 9};
        nums2 = new int[]{9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            Integer count = map.getOrDefault(nums1[i], 0) + 1;
            map.put(nums1[i], count);
        }
        int index = 0;
        for (int i = 0; i < nums2.length; i++) {
            Integer count = map.getOrDefault(nums2[i], 0);
            if (count > 0) {
                nums1[index++] = nums2[i];
                if (count-- > 0) {
                    map.put(nums2[i], count);
                } else {
                    map.remove(nums2[i]);
                }
            }
        }
        return Arrays.copyOfRange(nums1, 0, index);
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
