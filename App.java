import java.util.Scanner;

public class App {
  public static void main(String[] args) {
 
    System.out.println("キーボードから入力してください");

    Scanner scan = new Scanner(System.in);

    String str = scan.next();

    System.out.println("入力された文字は「" + str + "」です");

  }
}
