import java.util.HashMap;

/**
 * @description:
 * @time:2019/4/26
 *
 *
 * 给定一个非空整数数组，除了某个元素只出现一次以外，
 * 其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 输入: [2,2,1]
 * 输出: 1
 */
public class singleNumber {

    public static void main(String[] args) {
     int[] num = {2,2,1} ;
     /*
     一共有三种初始化方式
        arrayName = new type[]{element1,element2,element3...}
        type[] arrayName = {element1,element2,element3...};
        arrayName = new type[length];
      */

        long startTime1=System.nanoTime();   //获取开始时间
        System.out.println("1.使用遍历:"+singleNumber1(num));
        long endTime1=System.nanoTime(); //获取结束时间
        System.out.println("1.使用遍历程序运行时间： "+(endTime1-startTime1)+"ns");


        /**
         * 异或原理
         * 1.交换律：a ^ b ^ c <=> a ^ c ^ b
         * 2.任何数于0异或为任何数 0 ^ n => n
         * 3.相同的数异或为0: n ^ n => 0
         */
        long startTime2=System.nanoTime();   //获取开始时间
        System.out.println("2.使用异或:"+singleNumber2(num));//测试的代码段
        long endTime2=System.nanoTime(); //获取结束时间
        System.out.println("2.使用异或程序运行时间： "+(endTime2-startTime2)+"ns");



    }

    public static int singleNumber1(int[] nums) {
        for (int num:nums){
            int count = 0;
            for (int i = 0; i< nums.length;i++){
                if (nums[i] == num){
                    count = count +1;
                }
            }
            if (count==1){
                return num;
            }
        }
        return 0;
    }

    public static int singleNumber2(int[] nums) {
        int a = 0;
        for(int num:nums){
            a = a^num;
        }
        return a;
    }

}
