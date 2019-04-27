package easy;

/**
 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。
 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 J 中的字母不重复，J 和 S中的所有字符都是字母。
 字母区分大小写，因此"a"和"A"是不同类型的石头。
 */
public class Gems_stones {
    public static void main(String[] args) {
        String J = "z";
        String S = "ZZ";
        //方法1：split 遍历
        System.out.println("gem数量"+numJewelsInStones1(J,S));
        //方法2：toCharArray 将字符串转成字符数组
        System.out.println("使用toCharArray进行转换"+numJewelsInStones1(J,S));

    }

    public static int numJewelsInStones1(String J, String S) {
        int count = 0;
        String[] gem  = J.split("");
        String[] stone  = S.split("");
        for(int i=0;i<gem.length;i++){
            for (int j=0;j<stone.length;j++){
                if(gem[i].equals(stone[j])){
                    count = count +1;
                }
            }
        }
        return count;
    }

    public static int numJewelsInStones2(String J, String S) {
        int count = 0;
        char[] gem = J.toCharArray();//将字符串转成字符数组
        char[] stone = S.toCharArray();
        for(int i=0;i<gem.length;i++){
            for (int j=0;j<stone.length;j++){
                if(gem[i]== stone[j]){
                    count++;
                }
            }
        }
        return count;
    }



//



}
