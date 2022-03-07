public class App {
  public static void main(String[] args) {
    for (int n = 1; n <= 20; n++){
     if (n % 3 == 0 && n % 5 == 0){
      System.out.println("FizzBuzz");
      } else if (n % 3 == 0){
        System.out.println("Fizz");
      } else if (n % 5 == 0){
        System.out.println("Bizz"); 
      } else {
        System.out.println(n);
      }
    }
  }
}
