public class App {
  public static void main(String[] args){
    int[] array = {1, 2, 3};
    printArray(array);
    for (int i : array) {
      System.out.println(i);
    }
  }
  public static void printArray (int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i]++;
    }
  }
}