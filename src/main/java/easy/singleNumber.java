package easy;

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
        System.out.println(singleNumber(num));
    }

    public static int singleNumber(int[] nums) {


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



}
