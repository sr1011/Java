public class App {
  public static void main(String[] args){
    int isHungry = 1;
    String food = "焼肉";
    System.out.println("こんにちは");
    if (isHungry == 0){
      System.out.println("お腹がいっぱいです");
    } else {
      System.out.println("腹ペコです");
      System.out.println(food + "をいただきます");
      System.out.println("ごちそうさまでした");
    }
  }
}
