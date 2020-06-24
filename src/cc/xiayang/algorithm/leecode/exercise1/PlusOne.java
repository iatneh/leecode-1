package cc.xiayang.algorithm.leecode.exercise1;

import java.util.Arrays;

/**
 * @author xiayang@panda-fintech.com
 * @title: PlusOne
 * @copyright: Copyright (c) 2018
 * @description: <br>
 * @company: panda-fintech
 * @created on 6/24/20 11:05 AM
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = new int[]{9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (++digits[i] <= 9) {
                break;
            }
            digits[i] = 0;
        }
        if (digits[0] == 0) {
            int[] digitsNew = new int[len + 1];
            digitsNew[0] = 1;
            return digitsNew;
        }
        return digits;
    }
}
