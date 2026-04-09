// 演習の長さと円の面積を求める（円周率をfinal変数で表す）

package chap02;
import java.util.Scanner;

public class Circle1 {
    public static void main(String[] args) {
        final double PI = 3.1416;
        Scanner stdIn = new Scanner(System.in);

        System.out.print("半径：");
        double r = stdIn.nextDouble();

        System.out.println("演習の長さは" + (2*PI*r) + "です");
        System.out.println("面積は" + (r*r*PI) + "です");

        stdIn.close();
    }
}
