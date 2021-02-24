package cc.xiayang.algorithm.leecode.exercise1;

import java.util.Arrays;

/**
 * @author xiayang@panda-fintech.com
 * @title: 旋转图像
 * @copyright: Copyright (c) 2018
 * @description: <pre>
 * 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 *
 * 示例 1：
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[[7,4,1],[8,5,2],[9,6,3]]
 *
 * 示例 2：
 * 输入：matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 * 输出：[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 *
 * 示例 3：
 * 输入：matrix = [[1]]
 * 输出：[[1]]
 *
 * 示例 4：
 * 输入：matrix = [[1,2],[3,4]]
 * 输出：[[3,1],[4,2]]
 *
 * 提示：
 * matrix.length == n
 * matrix[i].length == n
 * 1 <= n <= 20
 * -1000 <= matrix[i][j] <= 1000
 * </pre>
 * @company: panda-fintech
 * @created on 2/24/21 3:22 PM
 */
public class RotateArray {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
        matrix = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
        matrix = new int[][]{{1}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
        matrix = new int[][]{{1, 2}, {3, 4}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void rotate(int[][] matrix) {
        int temp;
        for (int inner = 0; inner < matrix.length / 2; inner++) {
            for (int i = 0; i < matrix.length - 1 - inner * 2; i++) {
                int moveTimes = i + inner;
                temp = matrix[inner][moveTimes];
                matrix[inner][moveTimes] = matrix[matrix.length - 1 - moveTimes][inner];
                matrix[matrix.length - 1 - moveTimes][inner] = matrix[matrix.length - 1 - inner][matrix.length - 1 - moveTimes];
                matrix[matrix.length - 1 - inner][matrix.length - 1 - moveTimes] = matrix[moveTimes][matrix.length - 1 - inner];
                matrix[moveTimes][matrix.length - 1 - inner] = temp;
            }
        }
    }
}
