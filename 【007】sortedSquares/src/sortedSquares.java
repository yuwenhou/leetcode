import java.util.Arrays;

/**
 * @description:
 * @time:2019/4/29
 *
 * 给定一个按非递减顺序排序的整数数组 A，
 * 返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 * 示例 1：
 *
 * 输入：[-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 示例 2：
 *
 * 输入：[-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 *
 *
 */
public class sortedSquares {

    public static void main(String[] args) {

        int[] A = {-4,-1,0,3,10};

        System.out.println(Arrays.toString(sortedSquares1(A)));
    }

    private static int[] sortedSquares1(int[] A) {
//        int[] B = new int[A.length];
//        for(int i = 0; i<A.length;i++){
//            B[i] = A[i]*A[i];
//        }
//        Arrays.sort(B);
//        return B;



        for(int i = 0; i<A.length;i++){
            A[i] = A[i]*A[i];
        }
        Arrays.sort(A);
        return A;





    }


}
