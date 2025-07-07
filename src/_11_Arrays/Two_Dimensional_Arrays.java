package _11_Arrays;

public class Two_Dimensional_Arrays {
    public static void main(String[] args) {

        int[][] arr = new int[3][2]; // можно записать = {{1,2,3}, {4,5,6}};
        //   0  1
        // 0 0  0
        // 1 0  0
        // 2 0  0

//        arr[2][1] = 5;
//        System.out.println(arr[0][0] + " " + arr[0][1]);
//        System.out.println(arr[1][0] + " " + arr[1][1]);
//        System.out.println(arr[2][0] + " " + arr[2][1]);
        //    0 1 2
        //  0 0 0 0
        //  1 0 0 0

        arr[0][1] = 5;
        arr[1][0] = 4;
        System.out.println(arr[0][0] + " " + arr[1][0] + " " + arr[2][0]);
        System.out.println(arr[0][1] + " " + arr[1][1] + " " + arr[2][1]);

    }
}
