public class Learn {
  public static void main(String[] args){
    System.out.println("1つ目の整数を入力してください");
      int a1 = new java.util.Scanner(System.in) .nextInt();
      System.out.println("2つ目の整数を入力してください");
      int a2 = new java.util.Scanner(System.in) .nextInt();

      if (a1 > a2){
        System.out.println("大きい数は" + a1 + "です");
      } else if(a1 < a2) {
        System.out.println("大きい数は" + a2 + "です");
      }
  }
}