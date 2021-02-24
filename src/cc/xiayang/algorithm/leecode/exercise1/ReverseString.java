package cc.xiayang.algorithm.leecode.exercise1;

import java.util.Arrays;

/**
 * @author xiayang@panda-fintech.com
 * @title: ReverseString
 * @copyright: Copyright (c) 2018
 * @description: <br>
 * @company: panda-fintech
 * @created on 2/24/21 5:23 PM
 */
public class ReverseString {
    public static void main(String[] args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {
        char tmp;
        for (int i = 0; i < s.length / 2; i++) {
            tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp;
        }
    }
}
