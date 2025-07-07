package _11_Arrays;

import java.util.Arrays;

public class New_arr_29 {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 5};
        int[][] nums2 = {{11, 22, 33}, {44, 55, 66}};

        int[][] nums3 = {{1, 2}, {33, 44, 55}, {60}, {55, 100, 22, 99, 88}};
        System.out.println(nums3[3][1]);
        System.out.println(Arrays.deepToString(nums3));

        int[][] nums4 = new int[3][];
        nums4[0] = new int[3];
        nums4[1] = new int[2];
        nums4[2] = new int[4];

        nums4[0][0] = 22;
        nums4[0][1] = 33;
        nums4[0][1] = 44;

        nums4[1][0] = 100;
        nums4[1][1] = 200;

        nums4[2][0] = 5;
        nums4[2][1] = 6;
        nums4[2][2] = 7;
        nums4[2][3] = 8;

        System.out.println(Arrays.deepToString(nums4));

        int num5 [][] = { {1,22,3}, {6,7,8}};
        int num6 [][] = new int [2][3];

        int num7 [][] = { {20,30}, {77,99,88}, {200}, {12,45,87,64}};

        int num8 [][] = new int[4][];
        num8[0] = new int[2];
        num8[1] = new int[3];
        num8[2] = new int[1];
        num8[3] = new int[4];

        num8 [0][0] = 20;
        num8 [0][1] = 30;

        num8[1][0] = 77;
        num8[1][1] = 99;
        num8[1][2] = 88;

        num8[2][0] = 200;

        num8[3][0] = 12;
        num8[3][1] = 45;
        num8[3][2] = 87;
        num8[3][3] = 64;

        System.out.println(Arrays.deepToString(num8));

        System.out.println(Arrays.toString(new int[]{12,45,78}));
        System.out.println(Arrays.deepToString(new int [][] {{1,2}, {5,7}, {6,9}}));

    }
}
