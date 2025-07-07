package _13_list;

public class Draft {
    public static void main(String[] args) {

        System.out.println(unlucky1(new int[]{1,3,2}));

    }

    public static boolean unlucky1(int[] nums) {
        int len = nums.length;

        if (len >= 2) {
            if (nums[0] == 1 && nums[1] == 3 || (nums[1] == 1 && nums[2] == 3)) {
                return true;
            }
            if (nums[len - 2] == 1 && nums[len - 1] == 3) {
                return true;
            }

        }
        return false;
    }
}
