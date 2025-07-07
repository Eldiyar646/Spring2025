package _13_list._01_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class List9 {
    public static void main(String[] args) {
                                                       //     0  1  2  3  4  5  6  7  8  9
        ArrayList<Integer> nums = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        //                                              удалить элемент 3, 5, 7, 9
        for (int i = nums.size() - 1; i >= 0 ; i --) {
            if (i % 2 == 0) {
                nums.remove(i);
            }
        }
        System.out.println(nums);
    }
    }

