package chap02;
import java.util.Scanner;

public class HelloNext {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("お名前は：");
        String name = stdIn.nextLine();  // 1行分の文字列を読み込む（スペースも含まれる）

        System.out.println("こんにちは" + name + "さん");

        stdIn.close();
    }
}
