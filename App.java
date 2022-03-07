public class App {
  public static void main(String[] args){
    //変数宣言
    int price = 9260;
    int discount_rate = 33;
    char day_of_week = '土';
    int day_of_month = 5;
    
   //宣言した変数を利用して表示
   System.out.println("今日は" + day_of_month + "日" + "(" + day_of_week + ")");
   System.out.println("商品の価格は" + price + "円です");
   if ( day_of_month == 5 || day_of_month == 15 || day_of_month == 25 && day_of_week == '土'){
    discount_rate *= 1.5;
     System.out.println("5の付く日で土曜日は割引率更にアップ！！");
   }else if (day_of_week == '土'){
    discount_rate *= 1.2;
    System.out.println("土曜日は割引率アップ！");
   }
   System.out.println("割引率は"+ discount_rate + "%です");
   System.out.println("割引される金額は" + price * discount_rate * 0.01 + "円です" );
  }
}
