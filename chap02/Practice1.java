// 三つのint型変数に値を代入し、合計と平均を求めるプログラム

package chap02;

public class Practice1 {
    public static void main(String[] args) {
        int x, y, z;
        x = 12;
        y = 14;
        z = 18;

        System.out.println("合計は" + (x+y+z) + "です");
        System.out.println("平均は" + (x+y+z)/3 + "です");
    }
}
