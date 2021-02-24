package cc.xiayang.algorithm.leecode.everyday;

import java.util.Arrays;

/**
 * @author xiayang@panda-fintech.com
 * @title: 翻转图像
 * @copyright: Copyright (c) 2018
 * @description: <pre>
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 *
 * 示例 1：
 * 输入：[[1,1,0],[1,0,1],[0,0,0]]
 * 输出：[[1,0,0],[0,1,0],[1,1,1]]
 * 解释：首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
 *      然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
 *
 * 示例 2：
 * 输入：[[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * 输出：[[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * 解释：首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；
 *      然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 *
 * 提示：
 * 1 <= A.length = A[0].length <= 20
 * 0 <= A[i][j] <= 1
 * </pre>
 * @company: panda-fintech
 * @created on 2/24/21 5:40 PM
 */
public class FlipAndInvertImage {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(matrix)));
        matrix = new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(matrix)));
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        int tmp;
        for (int i = 0; i < A.length; i++) {
            int maxj = (A[i].length / 2) * 2 != A[i].length ? (A[i].length / 2 + 1) : (A[i].length / 2);
            for (int j = 0; j < maxj; j++) {
                tmp = A[i][j] ^ 1;
                A[i][j] = A[i][A[i].length - 1 - j] ^ 1;
                A[i][A[i].length - 1 - j] = tmp;
            }
        }
        return A;
    }
}
