package chap02;
import java.util.Random;

public class LuckyNo {
    public static void main(String[] args) {
        Random rand = new Random();
        int lucky = rand.nextInt(10);  // 0-9の乱数

        System.out.println("今日のラッキーナンバーは" + lucky + "です");
    }
}
