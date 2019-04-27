
/**
 * @description:
 * @time:2019/4/27
 *
 * 在二维平面上，有一个机器人从原点 (0, 0) 开始。给出它的移动顺序，
 * 判断这个机器人在完成移动后是否在 (0, 0) 处结束。 移动顺序由字符串表示。
 * 字符 move[i] 表示其第 i 次移动。机器人的有效动作有 R（右），L（左），U（上）和 D（下）。
 * 如果机器人在完成所有动作后返回原点，则返回 true。否则，返回 false。
 * 注意：机器人“面朝”的方向无关紧要。 “R” 将始终使机器人向右移动一次，“L” 将始终向左移动等。
 * 此外，假设每次移动机器人的移动幅度相同。
 *
 * 示例 1:
 * 输入: "UD"
 * 输出: true
 * 解释：机器人向上移动一次，然后向下移动一次。所有动作都具有相同的幅度，因此它最终回到它开始的原点。因此，我们返回 true。
 * 示例 2:
 * 输入: "LL"
 * 输出: false
 * 解释：机器人向左移动两次。它最终位于原点的左侧，距原点有两次 “移动” 的距离。我们返回 false，因为它在移动结束时没有返回原点。

 */
public class judgeCircle {
    public static void main(String[] args) {
        String str = "UD";
        long startTime = System.nanoTime();
        System.out.println("能否返回原点："+judgeCircle1(str));
        long endTime = System.nanoTime();
        System.out.println("总耗时："+(endTime- startTime) + "ns");


        long startTime2 = System.nanoTime();
        System.out.println("能否返回原点："+judgeCircle2(str));
        long endTime2 = System.nanoTime();
        System.out.println("x,y总耗时："+(endTime2- startTime2) + "ns");

    }

    //时间复杂度O(n)
    private static boolean judgeCircle1(String moves) {
        char[] ch = moves.toCharArray();
        int[] location = {0,0};
        int[] move = new int[2];

        for(int i =0; i<ch.length;i++){
            if (ch[i]=='U'){
                move = new int[]{0, 1};
            }else if (ch[i]=='D'){
                move = new int[]{0, -1};
            }else if (ch[i]=='L'){
                move = new int[]{-1, 0};
            }else{
                move = new int[]{1, 0};
            }
            location[0] = location[0] + move[0];
            location[1] = location[1] + move[1];
        }

        if(location[0]==0 && location[1]==0){
            return true;
        }else{
            return false;
        }
    }

    //时间复杂度O(n)
    private static boolean judgeCircle2(String moves) {
        int x=0;
        int y=0;
        char[] chars = moves.toCharArray();
        for(char c: chars ) {
            switch (c) {
                case 'U': x++; break;
                case 'D': x--; break;
                case 'L': y++; break;
                case 'R': y--; break;
            }
        }
        if (x==0 && y==0){
            return true;
        }else{
            return false;
        }
    }


}
