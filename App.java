public class App {
  public static void main(String[] args){
    // 勇者を生成
    Hero h = new Hero();
    // フィールドに初期化をセット
    h.name = "ミナト";
    h.hp = 100;
    System.out.println("勇者" + h.name + "を生み出しました！");
    h.sit(5);
    h.slip();
    h.sit(25);
    h.run();
  }
}