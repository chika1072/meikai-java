/*
概要：
二つの整数値を読み込んで加減乗除した値を表示

メモ：
- System.inは標準入力ストリーム
- stdIn.close()を書かないとリソースリークが起きる可能性がある
  ただしキーボード入力ではプログラム終了とともに閉じられる
*/

package chap02;
import java.util.Scanner;

public class ArithInt {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("xとyを加減乗除します");

        System.out.print("xの値：");  // xの値の入力を促す
        int x = stdIn.nextInt();  // xに整数値を読み込む

        System.out.print("yの値：");
        int y = stdIn.nextInt();

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        stdIn.close();
    }
}
