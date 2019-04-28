import java.util.Arrays;
import java.util.HashSet;

/**
 * @description:
 * @time:2019/4/28
 *
 * 给定整数数组 A，每次 move 操作将会选择任意 A[i]，并将其递增 1。
 * 返回使 A 中的每个值都是唯一的最少操作次数。
 * 示例 1:
 * 输入：[1,2,2]
 * 输出：1
 * 解释：经过一次 move 操作，数组将变为 [1, 2, 3]。
 * 示例 2:
 * 输入：[3,2,1,2,1,7]
 * 输出：6
 * 解释：经过 6 次 move 操作，数组将变为 [3, 4, 1, 2, 5, 7]。
 * 可以看出 5 次或 5 次以下的 move 操作是不能让数组的每个值唯一的。
 * 提示：
 *
 * 0 <= A.length <= 40000
 * 0 <= A[i] < 40000

 */
public class minIncrementForUnique {

    public static void main(String[] args) {

        int[] A = {3,2,1,2,1,7};
//        long startTime1 = System.nanoTime();
//        System.out.println("方法1："+minIncrementForUnique1(A));
//        long endTime1 = System.nanoTime();
//        System.out.println("方法1："+(endTime1-startTime1)+"ns");

//        long startTime2 = System.nanoTime();
//        System.out.println(minIncrementForUnique2(A));
//        long endTime2 = System.nanoTime();
//        System.out.println("方法2："+(endTime2-startTime2)+"ns");

        long startTime3 = System.nanoTime();
        System.out.println(minIncrementForUnique3(A));
        long endTime3 = System.nanoTime();
        System.out.println("方法3："+(endTime3-startTime3)+"ns");


    }

    private static int minIncrementForUnique1(int[] A) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int count = 0;
        do {
            hashSet.clear();
            for (int i = 1; i < A.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (A[i] == A[j]) {
                        A[i]++;
                        count ++;
                    }
                }
            }
            for (int ii=0; ii<A.length;ii++ ){
                hashSet.add(A[ii]);
            }
        }while (hashSet.size()!= A.length);
        System.out.println(Arrays.toString(A));
        return count;
    }


    private static int minIncrementForUnique2(int[] A) {
        if (A.length==0){return 0;}
        Arrays.sort(A);
        int AA = A[0];
        int count = 0;
        for (int i = 1;i<A.length;i++){
            if (A[i]>AA){
                AA = A[i];
            }else{
                A[i]++;
                count++;
                i--;
            }
        }
        System.out.println(Arrays.toString(A));
        return count;
    }

    //先排序，再按照坐标顺序补差
    private static int minIncrementForUnique3(int[] A) {
        if (A.length == 0) return 0;
        Arrays.sort(A);
        int N = A[0], cnt = 0;
        for (int i = 0; i < A.length; ++i) {
            System.out.println("i:"+i);
            System.out.println("N:"+N);

            if (A[i] <= N)
                cnt += N - A[i];
            else
                N = A[i];
            N++;
        }
        System.out.println(Arrays.toString(A));

        return cnt;
       }



}








