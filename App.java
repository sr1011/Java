public class App {
  public static void main(String[] args){
    // 勇者を生成
    Hero h = new Hero();
    //フィールドに初期化をセット
    h.name = "ミナト";
    h.hp = 100;

    //おばけキノコm1を生成
    Matango m1 = new Matango();
    //フィールドに初期化をセット
    m1.hp = 50;
    m1.suffix = 'A';

    //おばけキノコm2を生成
    Matango m2 = new Matango();
    //フィールドに初期化をセット
    m1.hp = 48;
    m1.suffix = 'B';

    h.slip();
    m1.run();
    m2.run();
    h.run()
  }
}