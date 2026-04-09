package chap02;
import java.util.Random;

public class Practice3 {
    public static void main(String[] args) {
        Random rand = new Random();

        // 0.0以上1.0未満の実数値をランダムに生成して表示
        double randomDouble1 = rand.nextDouble();
        System.out.println("0.0以上1.0未満のランダムな実数値：" + randomDouble1);


        // 0.0以上10.0未満の実数値をランダムに生成して表示
        double randomDouble2 = rand.nextDouble() * 10.0;
        System.out.println("0.0以上10.0未満のランダムな実数値：" + randomDouble2);
        
        // -1.0以上1.0未満の実数値をランダムに生成して表示
        double randomDouble3 = (rand.nextDouble() * 2.0) - 1.0;
        System.out.println("-1.0以上1.0未満のランダムな実数値：" + randomDouble3);
    }
}
