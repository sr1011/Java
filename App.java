public class App {
  public static void main(String[] args){
    int[] array = {1, 2, 3};
    printArray(array);
  }
  public static void printArray (int[] array) {
    array[0] = 100;
    for (int element : array) {
      System.out.println(element);
    }
  }
}