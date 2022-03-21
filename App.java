public class App {
  public static void main(String[] args){
    System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更");
    int select = new java.util.Scanner(System.in) .nextInt();
    if (select == 1){
      System.out.println("検索します");
    } else if (select == 2){
      System.out.println("登録します");
    } else if (select == 3){
      System.out.println("削除します");
    } else if (select == 4){
      System.out.println("変更します");
    }
  }
}
