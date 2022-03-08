public class App {
  public static void main(String[] args){
    //変数宣言
    int n1 = 25;
    int n2 = 2;
    String operator = "/";
    
   //宣言した変数を利用して表示
   System.out.println(n1 + operator + n2 + "=");
   if (operator == "/"){
     System.out.println(n1 / (double)n2);
   } else if (operator.equals("*")){
     System.out.println(n1 * (double)n2);
   } else if (operator == "+"){
     System.out.println(n1 + (double)n2);
   } else if (operator.equals("-")){
     System.out.println(n1 - (double)n2);
   }
  }
}
