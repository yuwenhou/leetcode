/**
 * @description:
 * @time:2019/4/27
实现函数 ToLowerCase()，该函数接收一个字符串参数 str，
并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
示例 1：
输入: "Hello"
输出: "hello"
示例 2：
输入: "here"
输出: "here"
示例 3：

输入: "LOVELY"
输出: "lovely"
 */
public class toLowerCase {

    public static void main(String[] args) {

        String str = "Hello";

        long startTime = System.nanoTime();
        System.out.println(toLowerCase1(str));
        long endTime = System.nanoTime();
        System.out.println("toLowerCase运行时间："+(endTime-startTime)+"ns");

        long startTime2 = System.nanoTime();
        System.out.println(toLowerCase2(str));
        long endTime2 = System.nanoTime();
        System.out.println("ASCII码运行时间："+(endTime2-startTime2)+"ns");
    }


    public static String toLowerCase1(String str){
        String newstr = str.toLowerCase();
        return newstr;
    }

    //使用ASCII码来处理
    public static String toLowerCase2(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i< ch.length;i++) {
            if (ch[i] > 64 && ch[i]< 91) {
                ch[i] += 32;
            }
        }
        return new String(ch);
    }




}
