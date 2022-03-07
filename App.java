public class App {
  public static void main(String[] args){
    //変数宣言
    int price = 9260;
    int discount_rate = 33;
    
   //宣言した変数を利用して表示
   System.out.println("商品の金額は" + price + "円です");
   System.out.println("消費税率は"+ discount_rate + "%です");
   System.out.println("税込み金額は" + (price * discount_rate * 0.01) + "円です");
  }
}
